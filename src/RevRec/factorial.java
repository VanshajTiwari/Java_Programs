package RevRec;

public class factorial {
    public static void main(String[] args) {
        int a=5;
        System.out.println(factorial(3));
    }
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
