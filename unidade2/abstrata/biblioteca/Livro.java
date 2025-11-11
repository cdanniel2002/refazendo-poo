package unidade2.abstrata.biblioteca;

public class Livro {
    String titulo;
    String autor;
    int numDePag;
    int anoDaEdicao;

    public Livro(String titulo, String autor, int numDePag, int anoDaEdicao){
        this.titulo = titulo;
        this.autor = autor;
        this.numDePag = numDePag;
        this.anoDaEdicao = anoDaEdicao;
    }

    public String qualTitulo(){
        return this.titulo;
    }

    public String qualAutor(){
        return this.autor;
    }

    @Override
    public String toString(){
        return "O livro " + titulo + " do autor " + autor + ", composto por " + numDePag + " páginas , no ano de " + anoDaEdicao + "\n";
    }
}
