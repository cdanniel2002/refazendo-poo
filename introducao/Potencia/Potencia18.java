package Potencia;
import java.util.Scanner;

public class Potencia18{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a base e o expoente: ");
        int base = scan.nextInt();
        int expoente = scan.nextInt();
        scan.close();

        System.out.println(potencia(base, expoente));
    }

    public static int potencia(int b, int e){
        if(e == 0){
            return 1; 
        }

        if(e == 1){
            return b;
        }

        return b * potencia(b, e - 1);
    }
}