package Menor;
import java.util.Scanner;

public class Menor7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe três numeros: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        scan.close();

        int menor = Math.min(n1, n2);
        menor = Math.min(menor, n3);

        System.out.println("Menor: " + menor);    
    }
}