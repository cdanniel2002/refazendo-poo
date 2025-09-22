package Fevereiro;
import java.util.Scanner;

public class Fevereiro12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o dia: ");
        int dia = scan.nextInt();
        scan.close();

        int resto = dia % 7;
        String nome = " ";

        switch(resto){
            case 1:
                nome = "Domingo";
                break;
            case 2: 
                nome = "Segunda";
                break;
            case 3: 
                nome = "Terça";
                break;
            case 4:
                nome = "Quarta";
                break;
            case 5: 
                nome = "Quinta";
                break;
            case 6:
                nome = "Sexta";
                break;
            case 0:
                nome = "Sabado";
        }

        System.out.println("O dia " + dia + " será um(a) " + nome);
    }
}