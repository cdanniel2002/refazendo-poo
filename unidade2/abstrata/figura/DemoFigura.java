package unidade2.abstrata.figura;

public class DemoFigura {
    public static void main(String[] args){
        Circulo c = new Circulo();
        Quadrado q = new Quadrado();
        Triangulo t = new Triangulo();

        c.descricao();
        q.descricao();
        t.descricao();
    }
}
