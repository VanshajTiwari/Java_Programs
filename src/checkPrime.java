import java.util.*;
public class checkPrime {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long a;
        a=sc.nextLong();
        if(a==2)
            System.out.println("Prime");
        else if(a>2){
            for(long i=2;i<a/2;i++){
                if(a%i==0){
                    System.out.println("Not Prime");
                    break;
                }
                else if(i==(a/2)-1){
                    System.out.println("Prime");}
            }
        }
        else{
            System.out.println("Not Prime");
        }

    }
}