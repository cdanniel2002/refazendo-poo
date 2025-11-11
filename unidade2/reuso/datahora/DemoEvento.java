package unidade2.reuso.datahora;

public class DemoEvento {
    public static void main(String[] args){
        DataHora dh = new DataHora();
        dh.setData("12/12/2025");
        dh.setHora("19:00");

        EventoDelegacao ed = new EventoDelegacao();
        ed.getDataHora().setData("11/10/2025");
        ed.getDataHora().setHora("20:00");
        ed.setEvento("Aniversario");

        EventoHeranca eh = new EventoHeranca();
        eh.setData("09/10/2025");
        eh.setHora("12:00");
        eh.setEvento("Confraternizacao");

        System.out.println(dh);
        System.out.println(ed);
        System.out.println(eh);
    }
}
