package Media;
import java.util.Scanner;

public class Media2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe as três notas: ");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        scan.close();

        double soma = n1 + n2 + n3;
        double media = soma / 3;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
}