package unidade2.arrays.matriz;

public class DemoMatriz {
    public static void main(String[] args){
        Matriz m = new Matriz(1, 2, 3, 4);

        System.out.println("Matriz: ");
        m.imprime();

        System.out.println("Determinante: " + m.calculaDeterminante());
    }
}