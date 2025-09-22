package Lado;
import java.util.Scanner;

public class Lado1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o lado: ");
        double l = scan.nextDouble();
        scan.close();

        double area = (Math.pow(l, 2));

        System.out.println("Area: " + area);
    }
}