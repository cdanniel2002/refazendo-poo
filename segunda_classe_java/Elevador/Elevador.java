package segunda_classe_java.Elevador;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int qtdPessoas;

    public Elevador(int capacidade, int totalAndares){
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.qtdPessoas = 0;
    }

    public boolean entra(){
        if(qtdPessoas < capacidade){
            qtdPessoas++;
            System.out.println("1 pessoa entrou no elevador, capacidade restante: " + (capacidade - qtdPessoas));
            return true;
        } else{
            System.out.println("Elevador chegou no limite, aguarde");
            return false;
        }
    }

    public boolean sai(){
        if(qtdPessoas > 0){
            qtdPessoas--;
            System.out.println("1 pessoa saiu, capacidade restante: " + (capacidade - qtdPessoas));
            return true;
        } else{
            System.out.println("Não tem ninguem no elevador");
            return false;
        }
    }

    public boolean sobe(){
        if(andarAtual < totalAndares){
            andarAtual++;
            System.out.println("Subindo um andar, andar atual: " + andarAtual);
            return true;
        } else{
            System.out.println("Chegou no ultimo andar");
            return false;
        }
    }

    public boolean desce(){
        if(andarAtual > 0){
            andarAtual--;
            System.out.println("Descendo um andar, andar atual: " + andarAtual);
            return true;
        } else{
            System.out.println("Chegou no terreo");
            return false;
        }
    }
}
