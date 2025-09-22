package Intervalo;
import java.util.Scanner;

public class Intervalo6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o intervalo em minutos: ");
        int min = scan.nextInt();
        scan.close();

        System.out.print(min + " minutos = ");

        int dias = min / (24 * 60);
        min = min % (24 * 60);

        int horas = min / 60;
        min = min % 60;

        int minutosGeral = min;

        System.out.println(dias + " dias, " + horas + " horas e " + minutosGeral + " minutos");
    }
}