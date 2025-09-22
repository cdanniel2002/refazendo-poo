package primeira_classe.Aluno;

public class DemoAluno{
    public static void main(String[] args){
        Aluno a = new Aluno(123, "Joao", 5, 4, 6);

        System.out.println("Nome: " + a.nome + " - Matricula: " + a.mat);
        System.out.println("Media: " + a.media());
        System.out.println("Precisa na Prova Final: " + a.provaFinal());
    }
}