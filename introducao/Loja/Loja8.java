package Loja;
import java.util.Scanner;

public class Loja8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o codigo e valor original: ");
        int codigo = scan.nextInt();
        double valor  = scan.nextDouble();
        scan.close();

        switch(codigo){
            case 222:
                if(valor > 500){
                    valor -= valor * 0.10;
                }
                System.out.println("Setor de Eletros");
                System.out.println("Valor com Desconto: " + valor);
                break;

            case 111:
                if(valor > 100){
                    valor -= valor * 0.40;
                } else if(valor >= 50 && valor <= 100){
                    valor -= valor * 0.20;
                } else if(valor < 50){
                    valor -= valor * 0.10;
                }
                System.out.println("Setor de cama, mesa e banho");
                System.out.println("Valor com Desconto: " + valor);
                break;
            
            default:
                System.out.println("Setor Invalido");
                break;
        }
    }
}
