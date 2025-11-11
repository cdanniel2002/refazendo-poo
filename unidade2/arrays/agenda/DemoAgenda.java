package unidade2.arrays.agenda;

public class DemoAgenda {
    public static void main(String[] args){
        Agenda a = new Agenda();

        a.addCompromissos(new EntradaEmAgenda("19:00", 17, 12, 2025, "Aniversario"));
        a.addCompromissos(new EntradaEmAgenda("15:00", 12, 11, 2025, "Reuniao"));

        a.listaDia(17, 12, 2025);
    }
}