package unidade2.arrays.dado;
import java.util.Random;

public class Dado {
    public static void main(String[] args){
        Random random = new Random();
        int[] frequencia = new int[13];

        int lancamentos = 36000000;

        for(int i = 0; i < lancamentos; i++){
            int dado1 = 1 + random.nextInt(6);
            int dado2 = 1 + random.nextInt(6);
            int soma = dado1 + dado2;
            frequencia[soma]++;
        }

        System.out.println("Soma\tFrequencia");

        for(int soma = 2; soma <= 12; soma++){
            System.out.printf("%d\t%, d%n", soma, frequencia[soma]);
        }
    }
}