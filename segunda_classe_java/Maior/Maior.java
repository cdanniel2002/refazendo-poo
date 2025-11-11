package segunda_classe_java.Maior;

public class Maior {
    
    public static int maiorDe2(int n1, int n2){
        return Math.max(n1, n2);
    }

    public static double maiorDe2(double n1, double n2){
        return Math.max(n1, n2);
    }

    public static int maiorDe3(int n1, int n2, int n3){
        return maiorDe2(maiorDe2(n1, n2), n3);
    }

    public static double maiorDe3(double n1, double n2, double n3){
        return maiorDe2(maiorDe2(n1, n2), n3);
    }

    public static int maiorDe4(int n1, int n2, int n3, int n4){
        return maiorDe2(maiorDe3(n1, n2, n3), n4);
    }

    public static double maiorDe4(double n1, double n2, double n3, double n4){
        return maiorDe2(maiorDe3(n1, n2, n3), n4);
    }

    public static int maiorDe5(int n1, int n2, int n3, int n4, int n5){
        return maiorDe2(maiorDe4(n1, n2, n3, n4), n5);
    }

    public static double maiorDe5(double n1, double n2, double n3, double n4, double n5){
        return maiorDe2(maiorDe4(n1, n2, n3, n4), n5);
    }
}
