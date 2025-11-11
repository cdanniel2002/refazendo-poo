package Intervalo;

import java.util.Scanner;
public class Tempo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        int min = scan.nextInt();
        scan.close();
        System.out.print(min + " minutos = ");

        int dias = min / (24 * 60);
        min = min % (24 * 60);

        int horas = min / 60;
        min = min % 60;;

        int minGeral = min;

        System.out.println(dias + " dias, " + horas + " horas e " + minGeral + " minutos.");

    }

    
}
