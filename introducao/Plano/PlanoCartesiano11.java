package Plano;
import java.util.Scanner;

public class PlanoCartesiano11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe os dois pontos no Plano: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        scan.close();

            if(y1 > y){
                System.out.println("O segundo está acima do primeiro");
            } else if(y1 < y){
                System.out.println("O segundo ponto esta abaixo do primeiro");
            }

            if(x1 < x){
                System.out.println("O segundo ponto esta a esquerda do primeiro");
            } else if(x1 > x){
                System.out.println("O segundo ponto esta a direita do primeiro");
            }

            if(x == x1 && y == y1){
            System.out.println("Os pontos estao na mesma posicao");
        }
    }
}
