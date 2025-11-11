package unidade2.abstrata.biblioteca;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args){
        LivroDeBiblioteca l = new LivroDeBiblioteca("Tempo", "Dom Ivn", 200, 2024, "Corredor 2, prateleira D");

        System.out.println("Titulo: " + l.qualTitulo());
        
        System.out.println("Autor: " + l.qualAutor());
        System.out.println();

        System.out.println("Descricao: " + l.descricao());
        
        System.out.println("Localizacao: " + l.localizacao());
        
        System.out.println("Prazo para Emprestimo: " + ItemDeBiblioteca.maximoDeDiasParaEmprestimo + " dias");
        System.out.println();

        System.out.println("Esta Emprestado: " + l.estaEmprestado());
        System.out.println();

        l.empresta();
        System.out.println("Esta Emprestado: " + l.estaEmprestado());
        System.out.println();

        l.devolve();
        System.out.println("Esta Emprestado: " + l.estaEmprestado());
        System.out.println();

        System.out.println(l);
    }
}
