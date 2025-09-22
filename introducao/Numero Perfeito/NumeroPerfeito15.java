public class NumeroPerfeito15{
    public static void main(String[] args){
        int perfeitoEncontrado = 0;
        long n = 2;

        while(perfeitoEncontrado < 4){
            long somaDivisores = 1;

            for(long i = 2; i <= n/2; i++){
                if(n % i == 0){
                    somaDivisores += i;
                }
            }

            if(somaDivisores == n){
                System.out.println("Encontrado: " + n);
                perfeitoEncontrado++;
            }
            n++;
        }
    }
}