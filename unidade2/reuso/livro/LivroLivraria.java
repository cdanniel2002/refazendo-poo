package unidade2.reuso.livro;

public class LivroLivraria extends Livro{
    private int qtdEstoque;
    private float valor;

    public LivroLivraria(String titulo, String autor, int qtdEstoque, float valor){
        super(titulo, autor);
        this.qtdEstoque = qtdEstoque;
        this.valor = valor;
    }

    public int getQtdEstoque(){
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }

    public float getValor(){
        return valor;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    @Override
    public String toString(){
        return super.toString() + "Quantidad em Estoque: " + qtdEstoque + "\nValor: " + valor + "\n";
    }
}
