package Recursion;
import java.util.Scanner;
public class fibonacciNum {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println(fibonacci(6));
    }
    public static int  fibonacci(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
}
