package Baralho;
import java.util.Scanner;

public class Baralho9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor da Carta e do Naipe: ");
        int valorCarta = scan.nextInt();
        int valorNaipe = scan.nextInt();
        scan.close();

        String carta = null;
        String naipe = null;

        switch(valorCarta){
            case 1:
                carta = "As";
                break;
            case 2:
                carta = "2";
                break;
            case 3:
                carta = "3";
                break;
            case 4:
                carta = "4";
                break;
            case 5:
                carta = "5";
                break;
            case 6:
                carta = "6";
                break;
            case 7:
                carta = "7";
                break;
            case 8:
                carta = "8";
                break;
            case 9:
                carta = "9";
                break;
            case 10:
                carta = "10";
                break;
            case 11:
                carta = "Valete";
                break;
            case 12:
                carta = "Rainha";
                break;
            case 13:
                carta = "Rei";
                break;
        }

        switch(valorNaipe){
            case 1:
                naipe = "Ouros";
                break;
            case 2:
                naipe = "Paus";
                break;
            case 3:
                naipe = "Copas";
                break;
            case 4:
                naipe = "Espadas";
                break;
        }

        if(carta != null && naipe != null){
            System.out.println("A carta é: " + carta + " de " + naipe);
        } else{
            System.out.println("Carta ou Naipe Invalidos");
        }
    }
}