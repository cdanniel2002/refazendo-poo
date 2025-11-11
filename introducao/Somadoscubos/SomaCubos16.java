package Somadoscubos;

public class SomaCubos16 {
    public static void main(String[] args){
        for(int n = 100; n < 999; n++){
            int centena = n / 100;
            int dezena = (n / 10) % 10;
            int unidade = n % 10;

            long cuboCentena = (long) Math.pow(centena, 3);
            long cuboDezena = (long) Math.pow(dezena, 3);
            long cuboUnidade = (long) Math.pow(unidade, 3);

            long soma = cuboCentena + cuboDezena + cuboUnidade;

            if(soma == n){
                System.out.printf("%d = %d^3 + %d^3 + %d^3 = %d + %d + %d\n", n, centena, dezena, unidade, cuboCentena, cuboDezena, cuboUnidade);
            }
        }
    }
}
