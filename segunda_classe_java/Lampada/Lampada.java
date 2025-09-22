package segunda_classe_java.Lampada;

import segunda_classe_java.Contador.Contador;

public class Lampada {
    String estadoDaLampada;
    Contador qtdVezesAcesa;

    public Lampada(){
        this.estadoDaLampada = "desligado";
        this.qtdVezesAcesa = new Contador();
    }

    public void acende(){
        if(estadoDaLampada.equals("desligado")){
            qtdVezesAcesa.incrementaCont();
        }

        estadoDaLampada = "ligado";
    }

    public void apaga(){
        estadoDaLampada = "desligado";
    }

    public void mostraEstado(){
        System.out.println("Qual Estado da Lampada: " + estadoDaLampada);
    }

    public boolean estaLigada(){
        return estadoDaLampada.equals("ligado");
    }

    public void qtdVezesAcesa(){
        qtdVezesAcesa.imprimeCont();
    }
    
}
