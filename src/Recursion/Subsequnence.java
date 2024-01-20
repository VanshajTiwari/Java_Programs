package Recursion;
import java.util.*;
public class Subsequnence {
    static int count=0;
    public static void main(String[] args) {
        System.out.println(runner("","abc"));
        System.out.println(count);
    }
    public static int runner(String ans,String abc){
        if(abc.isEmpty()){
            count++;
            System.out.println(ans);return 1;
        }
      //  for(int i=0;i<ans)
       int f1= runner(ans+abc.charAt(0),abc.substring(1));
       int f2= runner(ans,abc.substring(1));
        return f1+f2;
    }
}
