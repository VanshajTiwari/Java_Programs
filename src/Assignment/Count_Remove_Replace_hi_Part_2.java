package Assignment;
import java.util.*;
public class Count_Remove_Replace_hi_Part_2 {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     String str=input.next();
     System.out.println( Count_remove_replace(str,"",0));
        System.out.println( Count_remove_replace01(str,""));
    }
    public static String Count_remove_replace(String a,String b,int count){
        if(a.isEmpty()){
            System.out.println(count);
            return b;
        }
        if(a.startsWith("hi") && !(a.startsWith("hit"))){
            count++;
            return ""+Count_remove_replace(a.substring(2),b,count);}
        return  a.charAt(0)+ Count_remove_replace(a.substring(1),b,count);

    }
    public static String Count_remove_replace01(String a,String b){
        if(a.isEmpty()){

            return b;
        }
        if(a.startsWith("hi") && !(a.startsWith("hit"))){

            return "bye"+Count_remove_replace01(a.substring(2),b);}
        return  a.charAt(0)+ Count_remove_replace01(a.substring(1),b);

    }
}
