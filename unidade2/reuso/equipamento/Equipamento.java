package unidade2.reuso.equipamento;

public class Equipamento {
    private String problema;
    private float valor;

    public Equipamento(String problema, float valor){
        this.problema = problema;
        this.valor = valor;
    }

    public String getProblema(){
        return problema;
    }

    public void setProblema(String problema){
        this.problema = problema;
    }

    public float getValor(){
        return valor;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Problema: " + problema + "\nValor: " + valor + "\n";
    }
}
