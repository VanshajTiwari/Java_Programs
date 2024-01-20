import java.util.*;
public class numberLadder {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(),b=1;
        for(long i=0;i<a;i++){
            for(long j=0;j<=i;j++){
                System.out.print(b+" ");
                b++;
            }System.out.println("");
        }

    }
}