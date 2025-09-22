package segunda_classe_java.Complexo;

public class Complexo {
    double real;
    int imaginario;

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
        if(real == 0 && imaginario == 0){
            return "0";
        } else if(real !=0 && imaginario == 0){
            return "" + real;
        } else{
            return real + " + " + imaginario + "i";
        }
    }
}
