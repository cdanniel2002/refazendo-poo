package Angulo;
import java.util.Scanner;

public class Angulo3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o Angulo em Graus: ");
        double graus = scan.nextDouble();
        scan.close();

        double rad = Math.toRadians(graus);

        double seno = Math.sin(rad);
        double cosseno = Math.cos(rad);
        double tangente = Math.tan(rad);

        double cossecante = 1.0 / seno;
        double secante = 1.0 / cosseno;
        double cotangente = 1.0 / tangente;

        System.out.println("Radianos: " + rad);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Secante: " + secante);
        System.out.println("Cotangente: " + cotangente);
    }
}