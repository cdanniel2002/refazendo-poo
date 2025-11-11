package unidade2.arrays.cliente;

public class Cliente {
    int id;
    String nome;
    int idade;
    String telefone;

    public Cliente(int id, String nome, int idade, String telefone){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "\nID: " + id + "\nNome: " + nome + "\nIdade: " + idade + "\nTelefone: " + telefone + "\n";
    }
}