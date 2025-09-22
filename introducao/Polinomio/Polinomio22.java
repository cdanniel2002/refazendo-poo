package Polinomio;
import java.util.Scanner;

public class Polinomio22{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o grau de Polinomio(n): ");
        int n = scan.nextInt();

        System.out.print("Informe o valor de x para calcular P(x): ");
        double x = scan.nextDouble();

        System.out.println("Informe os coeficientes de acordo com oq for solicitado");

        double resultado = calculaPolinomio(n, x, scan);

        System.out.println("Informe o valor de P(" + x + ") é: " + resultado);
        scan.close();
    }

    public static double calculaPolinomio(int n1, double x1, Scanner scanner){
        if(n1 == 0){
            System.out.print("Informe o coeficiente de a0: ");
            double a0 = scanner.nextDouble();
            return a0;
        }

        double resultadoPolinomio = calculaPolinomio(n1 - 1, x1, scanner);

        System.out.print("Informe o coeficiente de a" + n1 + ": ");
        double an = scanner.nextDouble();

        return x1 * resultadoPolinomio + an;
    }
}