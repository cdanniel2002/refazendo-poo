package segunda_classe_java.Generico;

public class DemoGenerico { 
    public static void main(String[] args){
        Generico <Integer> g = new Generico<>(3,4,4);
        g.imprime();
        System.out.println("Quantidade de numeros iguais: " + g.iguais());    }    
}
