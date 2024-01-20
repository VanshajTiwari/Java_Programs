package Recursion;
import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Integer num=input.nextInt();
        String ans=checkPal(num)==num?"Palindrome":"Not Pallindrome";
        System.out.println(ans);
    }
    static int filler(int num,int rev){
        if(num<=0){
            return rev;
        }
        rev=rev*10+num%10;
        return filler(num/10,rev);
    }

    static int checkPal(int num){
        return   filler(num,0);
}
}