package unidade2.reuso.funcionario;

public class Tecnico extends Assistente{
    private double bonus;

    public Tecnico(String nome, double salario, String matricula, double bonus){
        super(nome, salario, matricula);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double ganhoAnual(){
        return (getSalario() * 13) + bonus;
    }

    @Override
    public String toString(){
        return super.toString() + "Bonus Salarial: R$" + bonus + "\n";
    }
}
