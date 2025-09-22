package segunda_classe_java.Academico;

public class DemoRegistroAcademico {
    public static void main(String[] args){
        RegistroAcademico a1 = new RegistroAcademico("Jo", "Medicina", 01);
        a1.imprime();
        System.out.println();

        RegistroAcademico a2 = new RegistroAcademico("Lui", "Enfermagem", 02);
        a2.imprime();
        System.out.println();

        RegistroAcademico a3 = new RegistroAcademico("Sesi", "Farmacologia", 04);
        a3.imprime();
    }
    
}
