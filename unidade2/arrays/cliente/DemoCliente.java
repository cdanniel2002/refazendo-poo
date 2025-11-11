package unidade2.arrays.cliente;
import java.util.Scanner;
import java.util.ArrayList;

public class DemoCliente {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();

        while(true){

            System.out.print("ID do Cliente (negativo para sair): ");
            int id = scan.nextInt();
            scan.nextLine();

            if(id < 0) break;

            System.out.print("Nome: ");
            String nome = scan.nextLine();

            System.out.print("Idade: ");
            int idade = scan.nextInt();
            scan.nextLine();

            System.out.print("Telefone: ");
            String telefone = scan.nextLine();

            clientes.add(new Cliente(id, nome, idade, telefone));
        }

        for(Cliente c : clientes){
            System.out.print(c);
        }

        scan.close();
    }
}