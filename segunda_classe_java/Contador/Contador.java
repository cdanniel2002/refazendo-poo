package segunda_classe_java.Contador;

public class Contador {
    private int cont;

    public Contador(){
        this.cont = 0;
    }

    public void zeraCont(){
        cont = 0;
    }

    public void incrementaCont(){
        cont++;
    }

    public void imprimeCont(){
        System.out.println(cont);
    }
}
