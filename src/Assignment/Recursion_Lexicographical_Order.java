package Assignment;

import java.util.Scanner;

public class Recursion_Lexicographical_Order {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>1){
            System.out.print(0+" ");
        for(int i=1;i<10;i++){
            System.out.print(lexico(i,num,""));}}
        else{
            System.out.println(0);
            }
        }

    public static String lexico(int i,int n,String result){
        if(i>n){
            return result;
        }
        result=result+i+" ";
        for(int j=0;j<10;j++){
          return  lexico(i*10+j,n,result);
            }
        return result+"";
        }
}
