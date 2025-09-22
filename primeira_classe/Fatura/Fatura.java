package primeira_classe.Fatura;

public class Fatura {
    int id;
    String descricao;
    int qtdComprada;
    double preco;

    public Fatura(int id, String descricao, int qtdComprada, double preco){
        this.id = id;
        this.descricao = descricao;
        

        if(qtdComprada > 0){
            this.qtdComprada = qtdComprada;
        }
        if(preco > 0){
            this.preco = preco;
        }
    }

    public double calculaTotal(){
        return qtdComprada * preco;
    }

    public void imprime(){
        System.out.println("ID do Produto: " + id);
        System.out.println("Descricao: " + descricao);
        System.out.println("Quantida Comprada: " + qtdComprada);
        System.out.println("Preço do Produto: " + preco);
        
    }
}
