import java.util.*;
public class fibonacci{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Input a number :)");
        int a=inp.nextInt();
        int b=0,c=1;
        int d;
        if(a>2){
            System.out.println(0);
        for(int i=1;i<a;++i){
            d=b+c;
            System.out.println(d);
            d=c^d;
            c=c^d;
            d=c^d;
            b=b^c;
            c=b^c;
            b=b^c;}}
        else{
            if(a==1){
                System.out.println("0");
            }
            else if(a==2){
                System.out.println("0\n1");
            }
            else{
                System.out.println("Invalid Input :(");
            }
            }



    }
}