package segunda_classe_java.Lampada;

public class DemoLampada {
    public static void main(String[] args){
        Lampada l = new Lampada();

        l.acende();
        l.acende();
        l.apaga();
        l.acende();
        l.acende();
        l.apaga();
        l.acende();
        l.mostraEstado();
        System.out.print("A lampada está ligada? ");
        if(l.estaLigada()){
            System.out.println("Verdadeiro");
        } else{
            System.out.println("Falso");
        }
        System.out.print("Quantas vezes a lampada foi Acesa? ");
        l.qtdVezesAcesa();
    }
    
}
