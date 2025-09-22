package Primo;
import java.util.Scanner;

public class Primo21{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int numero = scan.nextInt();
        scan.close();

        if(ehPrimo(numero)){
            System.out.println("O numero " + numero + " é Primo");
        } else{
            System.out.println("O numero " + numero + " não é Primo");
        }
    }

    public static boolean ehPrimo(int num){
        if(num <= 1){
            return false;
        }

        return contDivisores(num, 1) == 2;
    }

    public static int contDivisores(int n, int divisorAtual){
        if(divisorAtual > n){
            return 0;
        }

        if(n % divisorAtual == 0){
            return 1 + contDivisores(n, divisorAtual + 1);
        } else{
            return 0 + contDivisores(n, divisorAtual + 1);
        }
    }
}
