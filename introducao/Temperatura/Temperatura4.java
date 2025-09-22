package Temperatura;
import java.util.Scanner;

public class Temperatura4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus centigrados: ");
        float c = scan.nextFloat();
        scan.close();

        float f = (c * (float)9 / 5) + 32;

        System.out.println("Temperatura " + c + " graus Centigrados para Fahrenheit é: " + f);
    }
}