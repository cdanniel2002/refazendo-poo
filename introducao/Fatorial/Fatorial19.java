package Fatorial;
import java.util.Scanner;

public class Fatorial19{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int num = scan.nextInt();
        scan.close();

        fatorial(num);
    }

    public static long fatorial(int n){
        if(n == 0){
            System.out.println("0! = 1");
            return 1;
        }

        long fat = n * fatorial(n - 1);

        for(int i = 0; i < n; i++){
            System.out.print("\t");
        }

        System.out.println(n + "! = " + fat);
        return fat;
    }
}