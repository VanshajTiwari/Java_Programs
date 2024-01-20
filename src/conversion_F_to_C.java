import java.util.*;
public class conversion_F_to_C {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        for(double i=a;i<=b;i+=c){
            d=(5*(i-32))/9;
            System.out.print((int)i+" "+(int)d+"\n");
        }
    }
}