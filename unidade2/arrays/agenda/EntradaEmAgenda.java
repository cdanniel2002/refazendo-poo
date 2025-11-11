package unidade2.arrays.agenda;

public class EntradaEmAgenda {
    String hora;
    int dia;
    int mes;
    int ano;
    String assunto;

    public EntradaEmAgenda(String hora, int dia, int mes, int ano, String assunto){
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    @Override
    public String toString(){
        return "Hora: " + hora + "\nDia: " + dia + "\nMes: " + mes + "\nAno: " + ano + "\nAssunto: " + assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano){
        return this.dia == dia && this.mes == mes && this.ano == ano;
    }
}