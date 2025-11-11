package Megasena;

public class MegaSena {
    public static void main(String[] args){
        for(int n = 1; n <= 60; n++){
            System.out.printf("%02d ", n);
            if(n % 10 == 0){
                System.out.println();
            }
        }
    }
    
}
    

