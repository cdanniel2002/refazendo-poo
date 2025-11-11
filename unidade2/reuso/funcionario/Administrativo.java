package unidade2.reuso.funcionario;

public class Administrativo extends Assistente{
    private String turno;
    private double adicional;

    public Administrativo(String nome, double salario, String matricula, String turno, double adicional){
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicional = adicional;
    }

    public String getTurno(){
        return turno;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }

    public double getAdicional(){
        return adicional;
    }

    public void setAdicional(double adicional){
        this.adicional = adicional;
    }

    @Override
    public double ganhoAnual(){
        if(turno.equalsIgnoreCase("noite")){
            return (getSalario() * 13) + (adicional * 12);
        } else{
            return (getSalario() * 13);
        }
    }

    @Override
    public String toString(){
        return super.toString() + "Turno: " + turno + "\nAdicional Noturno: R$" + adicional + "\n";
    }
}
