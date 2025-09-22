package segunda_classe_java.Generico;

public class Generico <T>{
    T n1;
    T n2;
    T n3;

    public Generico(T n1, T n2, T n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int iguais(){
        if(n1.equals(n2) && n2.equals(n3)){
            return 3;
        }else if(n1.equals(n2) || n1.equals(n3) || n2.equals(n3)){
            return 2;        
        } else {
            return 0;
        }
    }

    public void imprime(){
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
