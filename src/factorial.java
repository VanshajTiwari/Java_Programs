import java.util.*;
public class factorial{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        findFact(num);
    }
    public static void  findFact(int n){
        int i=1;
        int fact=1;
        while(i<=n){
            fact*=i;
            System.out.println("factorial of "+i+" is "+fact);
            i++;

        }
    }
}