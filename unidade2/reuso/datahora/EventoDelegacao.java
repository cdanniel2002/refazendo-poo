package unidade2.reuso.datahora;

public class EventoDelegacao {
    private DataHora dataHora;
    private String evento;

    public EventoDelegacao(){
        dataHora = new DataHora();
    }

    public DataHora getDataHora(){
        return dataHora;
    }

    public void setEvento(String evento){
        this.evento = evento;
    }

    @Override
    public String toString(){
        return dataHora.toString() + "Evento: " + evento + "\n";
    }
}
