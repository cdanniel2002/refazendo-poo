package MDC;
import java.util.Scanner;

public class Mdc20{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe dois valores para calcular o mdc: ");
        int m = scan.nextInt();
        int n = scan.nextInt();

        System.out.println("O mdc é: " + mdc(m, n));
        scan.close();
    }

    public static int mdc(int m1, int n1){
        if(n1 > m1){
            return mdc(n1, m1);
        } else if(n1 == 0){
            return m1;
        } else{
            return mdc(n1, m1 % n1);
        }
    }
}