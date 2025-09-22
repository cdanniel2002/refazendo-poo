package Fibonacci;
import java.util.Scanner;

public class Fibonacci14{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int n = scan.nextInt();
        scan.close();

        long termoAnterior = 0;
        long termoAtual = 1;

        System.out.println("A serie de Fibonacci de " + n + " termos é: ");

        for(int i = 1; i <= n; i++){
            System.out.print(termoAnterior);
            if(i < n){
                System.out.print(", ");
            }

            long proximoTermo = termoAnterior + termoAtual;

            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }
        System.out.println();
    }
}