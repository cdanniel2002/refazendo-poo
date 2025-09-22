package Populacao;
public class Populacao17{
    public static void main(String[] args){
        double populacaoA = 7000;
        double populacaoB = 20000;
        int anos = 0;

        while(populacaoA < populacaoB){
            populacaoA += populacaoA * 0.035;
            populacaoB += populacaoB * 0.01;
            anos++;
        }

        System.out.println("São necessários " + anos + " anos para que a população da cidade A seja maior ou igual a da população B");
    }
}