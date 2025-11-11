package unidade2.excecao;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Informe o primeiro numero");
        int num1 = obterIntValido();

        System.out.print("Informe o segundo numero");
        int num2 = obterIntValido();

        int soma = num1 + num2;

        System.out.println("Resultado: " + num1 + " + " + num2 + " = " + soma);
        
        scan.close();
    }

    public static int obterIntValido(){
        while(true){
            try{
                System.out.print("Informe um numero inteiro: ");
                int numero = scan.nextInt();
                scan.nextLine();
                return numero;
            } catch(InputMismatchException e){
                System.out.println("ERRO: O valor não é um número inteiro. Tente Novamente");
                scan.nextLine();
            }
        }
    }
}
