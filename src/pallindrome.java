import java.util.Scanner;
public class pallindrome{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number :)");
        int num=input.nextInt();
        int rep=num,r=0;
        while(rep>0){
            int c=rep%10;
            r=r*10+c;
            rep/=10;
        }
        System.out.print((r==num)?"Pallindrome":"Not Pallindrome");


    }
}