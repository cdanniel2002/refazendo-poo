package unidade2.arrays.agenda;
import java.util.ArrayList;

public class Agenda {
    ArrayList<EntradaEmAgenda> compromissos;

    public Agenda(){
        compromissos = new ArrayList<>();
    }

    public void addCompromissos(EntradaEmAgenda entrada){
        compromissos.add(entrada);
    }

    public void listaDia(int dia, int mes, int ano){
        for(EntradaEmAgenda e : compromissos){
            if(e.ehNoDia(dia, mes, ano)){
                System.out.println(e);
            }
        }
    }
}