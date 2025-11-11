package unidade2.reuso.funcionario;

public class DemoFuncionario {
    public static void main(String[] args){
        Funcionario f = new Funcionario("Jose", 1500.00);

        Assistente a = new Assistente("Jose", 1500.00, "03");

        Tecnico t = new Tecnico("Jose", 1500.00, "03", 300.00);

        Administrativo adm = new Administrativo("Jose", 1500, "03", "noite", 200.00);

        System.out.println(f);
        System.out.println(a);

        System.out.print(t);
        System.out.println("Ganho Anual: R$" + t.ganhoAnual());

        System.out.println();

        System.out.print(adm);
        System.out.println("Ganho Anual: R$" + adm.ganhoAnual());
    }
}
