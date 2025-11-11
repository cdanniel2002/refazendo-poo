package unidade2.reuso.livro;

public class LivroBiblioteca extends Livro{
    private int qtdDisponiveis;
    private String local;
    /* private boolean disponivel; */

    public LivroBiblioteca(String titulo, String autor,int qtdDisponiveis, String local/* , booelan disponivel */){
        super(titulo, autor);
        this.qtdDisponiveis = qtdDisponiveis;
        this.local = local;
    }

    public int getQtdDisponiveis(){
        return qtdDisponiveis;
    }

    public void setQtdDisponiveis(int qtdDisponiveis){
        this.qtdDisponiveis = qtdDisponiveis;
    }

    public String getLocal(){
        return local;
    }

    public void setLocal(String local){
        this.local = local;
    }

    @Override
    public String toString(){
        return super.toString() + "Quantidade Disponiveis: " + qtdDisponiveis + "\nLocal: " + local + "\n";
    }
}
