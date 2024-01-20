package Recursion;
import java.util.Scanner;
public class numberfrom1ton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pritify(num+1);
    }
    public static void pritify(int num){
        if(num==1)
            return;
        pritify(--num);
        System.out.println(num);
    }
}
