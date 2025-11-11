package unidade2.arrays.produtorio;

public class Produtorio {
    public static long produto(int... numeros){

        long resultado = 1;

        for(long n : numeros){
            resultado *= n;
        }

        return resultado;
    }
}