package unidade2.colecoes;
import java.util.Stack;

public class Balanceamento {
    public static boolean estaBalanceada(String texto){
        Stack<Character> pilha = new Stack<>();

        for(char c : texto.toCharArray()){
            if(c == '('){
                pilha.push(c);
            } else if(c == ')'){
                if(pilha.isEmpty()){
                    return false;
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
    public static void main(String[] args){
        String[] balanceada = {"()()", "((()))"};

        for(String s : balanceada){
            System.out.println("'" + s + "': " + estaBalanceada(s));
        }

        String[] naoBalanceado = {"(()", "((()"};

        for(String s : naoBalanceado){
            System.out.println("'" + s + "': " + estaBalanceada(s));
        }
    }
}
