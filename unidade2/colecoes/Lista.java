package unidade2.colecoes;
import java.util.LinkedList;

public class Lista {
    public static void main(String[] args){
        LinkedList<Character> listaOriginal = new LinkedList<>();

        for(int i = 0; i < 10; i++){
            listaOriginal.add((char) ('A' + i));
        }
        System.out.println("Lista Original: " + listaOriginal);

        LinkedList<Character> listaInvertida = new LinkedList<>();
        for(Character c : listaOriginal){
            listaInvertida.addFirst(c);
        }
        System.out.println("Lista Invertida: " + listaInvertida);
    }
}
