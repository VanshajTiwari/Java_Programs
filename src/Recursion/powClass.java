package Recursion;

import java.util.Scanner;

public class powClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(pow(num,k));
    }
    public static int pow(int num,int k){
        if(k==1){
            return num;
        }
        return num*pow(num,k-1);
    }
}
