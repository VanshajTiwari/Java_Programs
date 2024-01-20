import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Number :) ");
        int num=input.nextInt();
        isArmstrong(num);
    }
    public static void isArmstrong(int num){
        int rep=num,i=0,isarm=0;
        while(rep>0){
            i++;
            rep/=10;
        }
        rep=num;
        while(rep>0){
            int c=rep%10;
            isarm+=Math.pow(c,i);
            rep/=10;
        }
        System.out.print(isarm==num?"Armstrong":"Not Armstrong");
    }
}