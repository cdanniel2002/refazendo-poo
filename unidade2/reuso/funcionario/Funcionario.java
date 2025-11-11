package unidade2.reuso.funcionario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void aumentarSalario(double aumento){
        this.salario += aumento;
    }

    public double ganhoAnual(){
        return (salario * 12) + salario;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nSalario: R$" + salario + "\n";
    }


}
