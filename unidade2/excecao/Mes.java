package unidade2.excecao;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Mes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] meses = new String[12];

        meses[0] = "janeiro";
        meses[1] = "fevereiro";
        meses[2] = "março";
        meses[3] = "abril";
        meses[4] = "maio";
        meses[5] = "junho";
        meses[6] = "julho";
        meses[7] = "agosto";
        meses[8] = "setembro";
        meses[9] = "outubro";
        meses[10] = "novembro";
        meses[11] = "dezembro";

        System.out.println("Informe o mes: ");

        try{
            int mes = Integer.parseInt(scan.nextLine());
            System.out.println("Mes Escolhido: " + meses[mes - 1]);
        } catch(InputMismatchException e){
            System.out.println("Informe um inteiro!");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Informe um inteiro entre 1 e 12");
        } catch(NumberFormatException e){
            System.out.println("Informe um inteiro!");
        }
        scan.close();
    }
}
