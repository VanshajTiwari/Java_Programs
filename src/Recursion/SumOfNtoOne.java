package Recursion;
import java.util.*;
public class SumOfNtoOne {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int num=input.nextInt();
        System.out.println(sumNum(num));
    }
    public static int sumNum(int n){
        if(n==0){
            return 0;
        }
        return n+sumNum(n-1);
    }
}
