package Numeroperfeito;

public class Perfeito {
    public static void main (String[] args){
        int qtdPerfeito = 0;
        long n = 2;

        while(qtdPerfeito < 4){
            long somaDivisores = 1;

            for(long i = 2; i <= n/2; i++){
                if(n % i == 0){
                    somaDivisores += i; 
                }
            }

            if(somaDivisores == n){
                System.out.println("Encontrado: " + n);
                qtdPerfeito++;
            }
            n++;
        }
    }
    
}
