import java.util.*;
public  class Largestnumber{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();
        int c=inp.nextInt();
       System.out.println(findLargestNum(a,b,c));
    }
    public static String findLargestNum(int a,int b,int c){
        if(a>b && a>c){
            return ("Largest number is "+a);
        }
        else if(b>a && b>c){
           return ("Largest number is "+b);
        }
        else
           return ("Largest number is "+c);
    }
}