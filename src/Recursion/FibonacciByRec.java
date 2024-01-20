package Recursion;

public class FibonacciByRec {
    public static void main(String[] args) {
        counter(6,0);
    }
    public static void counter(int n,int a){
        if(a>n){
            return;
        }

        System.out.println(fibonacci(a));
        counter(n,a+1);
    }
    public static int fibonacci(int n){
        if(n<2){
            return n;
        }
       return fibonacci(n-1)+fibonacci(n-2);
    }
}

