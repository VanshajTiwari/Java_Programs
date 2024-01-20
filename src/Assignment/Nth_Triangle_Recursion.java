package Assignment;

import java.util.Scanner;
public class Nth_Triangle_Recursion {
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