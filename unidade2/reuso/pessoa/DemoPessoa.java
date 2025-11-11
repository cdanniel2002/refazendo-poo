package unidade2.reuso.pessoa;

public class DemoPessoa {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Jose", 33);

        Politico politico = new Politico("Jose", 33, "PT");

        Prefeito prefeito = new Prefeito("Jose", 33, "PT", "Sousa");

        Governador governador = new Governador("Jose", 33, "PT", "Paraiba");

        System.out.println(pessoa);
        System.out.println(politico);
        System.out.println(prefeito);
        System.out.println(governador);
    }
}
