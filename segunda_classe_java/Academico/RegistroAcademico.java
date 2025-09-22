package segunda_classe_java.Academico;

public class RegistroAcademico {
    static int numDeMatriculas;
    int matricula;
    String nome;
    int codCurso;
    String curso;

    public RegistroAcademico(String nome, String curso, int codCurso){
        this.nome = nome;
        this.codCurso = codCurso;
        this.curso = curso;
        numDeMatriculas++;
        this.matricula = numDeMatriculas;

    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Codigo de Curso: " + codCurso);
        System.out.println("Matricula: " + matricula);
    }
}
