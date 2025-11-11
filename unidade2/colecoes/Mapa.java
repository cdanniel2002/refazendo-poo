package unidade2.colecoes;
import java.util.TreeMap;

public class Mapa {
    public static void main(String[] args){
        TreeMap<Character, Integer> mapa = new TreeMap<>();

        String entrada = "HELLO THERE";

        for(Character aux : entrada.toCharArray()){
            if(Character.isLetter(aux)){
                if(mapa.containsKey(aux)){
                    int var = mapa.get(aux) + 1;
                    mapa.put(aux, var);
                } else{
                    mapa.put(aux, 1);
                }
            }
        }
        for(Character aux : mapa.keySet()){
            System.out.println("Letra: " + aux + "= " + mapa.get(aux));
        }
    }
}
