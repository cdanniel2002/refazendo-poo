package primeira_classe.Time;

public class Time {
    String nome;
    String campeonato;
    int vitorias;
    int empates;
    

    public Time(String nome, String campeonato, int vitorias, int empates){
        this.nome = nome;
        this.campeonato = campeonato;
        this.vitorias = vitorias;
        this.empates = empates;
    }

    public int pontos(){
        return vitorias * 3 + empates;
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Campeonato: " + campeonato);
        System.out.println("Vitorias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Pontos: " + pontos());
    }
    
}
