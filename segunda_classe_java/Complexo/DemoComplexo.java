package segunda_classe_java.Complexo;

public class DemoComplexo {
    public static void main(String[] args){
        Complexo c1 = new Complexo(2,4);
        Complexo c2 = new Complexo(2);
        Complexo c3 = new Complexo();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
    
}
