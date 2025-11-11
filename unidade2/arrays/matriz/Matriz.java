package unidade2.arrays.matriz;

public class Matriz {
    float[][] matriz;

    public Matriz(float n1, float n2, float n3, float n4){
        matriz = new float[2][2];

        matriz[0][0] = n1;
        matriz[0][1] = n2;
        matriz[1][0] = n3;
        matriz[1][1] = n4;
    }

    public float calculaDeterminante(){
        float determinante = matriz[0][0] * matriz[1][1] - (matriz[0][1] * matriz[1][0]);
        return determinante;
    }

    public void imprime(){
        System.out.println("[" + matriz[0][0] + "\t" + matriz[0][1] + "]" + "\n" + "[" + matriz[1][0] + "\t" + matriz[1][1] + "]");
    }
}