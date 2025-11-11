package unidade2.reuso.datahora;

public class DataHora {
    private String data;
    private String hora;

    public DataHora(){}

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getHora(){
        return hora;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    @Override
    public String toString(){
        return "Data: " + data + "\nHora: " + hora + "\n";
    }
}
