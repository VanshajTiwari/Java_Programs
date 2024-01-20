package Recursion;

import java.util.Scanner;

public class ReversePrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        reverseNum(num);
    }


    public static void reverseNum(int num) {
        if(num==0){
            return;
        }
        System.out.println(num);
        reverseNum(num-1);
        System.out.println(num);

    }
}