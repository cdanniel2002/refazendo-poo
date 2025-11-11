package unidade2.reuso.datahora;

public class EventoHeranca extends DataHora{
    private String evento;

    public void setEvento(String evento){
        this.evento = evento;
    }

    @Override
    public String toString(){
        return super.toString() + "Evento: " + evento + "\n";
    }
}
