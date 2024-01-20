import java.util.*;
public class Decimaltobinary {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        String bin="";
        while(num>0){
            int c=num%2;
            bin=Integer.toString(c)+bin;
            num/=2;
        }
        System.out.print(bin);
    }
}