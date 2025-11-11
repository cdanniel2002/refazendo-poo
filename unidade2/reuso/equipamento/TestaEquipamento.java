package unidade2.reuso.equipamento;

public class TestaEquipamento {
    public static void main(String[] args){
        Equipamento e = new Equipamento("Tela quebrada", 150.00F);
        Computador c = new Computador("Tela quebrada", 150.00F, "Lenovo", "IdeapadFlexI5");

        System.out.println(e);
        System.out.println(c);
    }
}
