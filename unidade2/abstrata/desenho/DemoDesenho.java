package unidade2.abstrata.desenho;
import unidade2.abstrata.figura.*;
public class DemoDesenho {
    public static void main(String[] args){
        Desenho d1 = new Desenho(new Circulo(), 2, 3, new Quadrado(), 3, 4);
        Desenho d2 = new Desenho(new Quadrado(), 3, 4, new Triangulo(), 2, 3);

        d1.apresenta();
        d2.apresenta();
    }
}
