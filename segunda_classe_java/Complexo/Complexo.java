package segunda_classe_java.Complexo;

public class Complexo{
    double real;
    double imaginario;

    public Complexo(double real, int imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complexo(double real){
        this.real = real;
        this.imaginario = 0;
    }

    public Complexo(){
        this.real = 0;
        this.imaginario = 0;
    }

    @Override
    public String toString(){
        return real + " + " + imaginario + "i";
        }
}

