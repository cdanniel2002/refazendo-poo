package Inversao;
import java.util.Scanner;

public class Inversao5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um numero de 3 digitos: ");
        int cdu = scan.nextInt();
        scan.close();

        if(cdu < 100 || cdu > 999){
            System.out.println("Informe um numero de 3 digitos!");
            return;
        }

        int c = cdu / 100;
        int d = (cdu % 100) / 10;
        int u = cdu % 10;
        
        int ucd = (u*100) + (c*10) + d;

        System.out.println(cdu + " deve ser reescrito como " + ucd);
    }
}