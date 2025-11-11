package unidade2.abstrata.funcionario;

public class DemoFuncionario {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario("Jose");

        Funcionario f2 = new Funcionario("Jose", 5.0);

        f1.registrarHoras(60);
        f2.registrarHoras(50);

        System.out.print(f1);
        System.out.println("Horas Trabalhadas: " + f1.horasTrabalhadas);
        System.out.println("Salario: R$" + f1.calcularSalario());

        System.out.println();

        System.out.print(f2);
        System.out.println("Horas Trabalhadas: " + f2.horasTrabalhadas);
        System.out.println("Salario: R$" + f2.calcularSalario());
    }
}
