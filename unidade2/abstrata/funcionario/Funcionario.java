package unidade2.abstrata.funcionario;

public class Funcionario {
    String nome;
    double salarioPorHora;
    double horasTrabalhadas;

    public Funcionario(String nome){
        this.nome = nome;
        this.salarioPorHora = 2.0;
        this.horasTrabalhadas = 0.0;
    }

    public Funcionario(String nome, double salarioPorHora){
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = 0.0;
    }

    public void registrarHoras(double horas){
        if(horas > 0){
            this.horasTrabalhadas += horas;
        } else{
            System.out.println("Horas Invalidas");
        }
    }

    public double calcularSalario(){
        return this.salarioPorHora * this.horasTrabalhadas;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nSalario Por Hora: " + salarioPorHora + "\n";
    }
}
