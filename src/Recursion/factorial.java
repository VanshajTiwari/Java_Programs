package Recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    private static int fact(int i) {
        if(i==1){
            return 1;
        }
        return  fact(i-1)*i;
    }
}
