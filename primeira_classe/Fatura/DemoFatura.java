package primeira_classe.Fatura;

public class DemoFatura {
    public static void main(String[] args){
        Fatura faturaErrada = new Fatura(1, "Pao", -3, -2);

        faturaErrada.imprime();
        System.out.println("Fatura Errada: " + faturaErrada.calculaTotal());

        Fatura faturaCerta = new Fatura(1, "Pao", 2, 3);
        faturaCerta.imprime();
        System.out.println("Fatura Certa: " + faturaCerta.calculaTotal());
    }
    
}
