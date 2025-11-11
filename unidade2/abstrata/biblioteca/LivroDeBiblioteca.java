package unidade2.abstrata.biblioteca;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    String localizacao;
    boolean emprestado;

    public LivroDeBiblioteca(String titulo, String autor, int numDePag, int anoDaEdicao, String localizacao){
        super(titulo, autor, numDePag, anoDaEdicao);
        this.localizacao = localizacao;
        this.emprestado = false;
    }
    
    @Override
    public boolean estaEmprestado(){
        return this.emprestado;
    }

    @Override
    public void empresta(){
        this.emprestado = true;
    }

    @Override
    public void devolve(){
        this.emprestado = false;
    }

    @Override
    public String localizacao(){
        return this.localizacao;
    }

    @Override
    public String descricao(){
        return "\nLivro: " +  this.qualTitulo();
    }

    @Override
    public String toString(){
        String status = this.emprestado? "Emprestado" : "Disponivel";

        return super.toString() + "Localizacao: " + localizacao + "\nStatus: " + status;
    }
}
