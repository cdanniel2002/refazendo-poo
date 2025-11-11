package unidade2.abstrata.desenho;
import unidade2.abstrata.figura.*;
public class Desenho {
    FiguraGeometrica fig1;
    FiguraGeometrica fig2;
    double x1, y1;
    double x2, y2;

    public Desenho(FiguraGeometrica fig1, double x1, double y1, FiguraGeometrica fig2, double x2, double y2){
        this.fig1 = fig1;
        this.x1 = x1;
        this.y1 = y1;
        this.fig2 = fig2;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void apresenta(){
        System.out.println("Figura 1: ");
        System.out.println("Coordenadas: " + "(" + x1 + ", " + y1 + ")");
        fig1.descricao();

        System.out.println("Figura 2: ");
        System.out.println("Coordenadas: " + "(" + x2 + ", " + y2 + ")");
        fig2.descricao();
    }    
}
