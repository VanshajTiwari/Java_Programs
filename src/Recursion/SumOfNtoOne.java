package Recursion;

public class SumOfNtoOne {
    public static void main(String[] args) {
        System.out.println(sumNum(3));
    }
    public static int sumNum(int n){
        if(n==0){
            return 0;
        }
        return n+sumNum(n-1);
    }
}
