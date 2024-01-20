package Assignment;
import java.awt.*;
import java.util.*;
public class Replace_all_0s_with_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String num1=input.nextLine();
        System.out.println(replace0to5(num1,"",0));
    }
   public  static String replace0to5(String num1,String rev,int index) {
    if(index==num1.length()){
        return rev;
    }
       if (num1.charAt(index) == '0') {
           rev += "5";
       }
       else {
           rev += Character.toString(num1.charAt(index));
       }

    return replace0to5(num1, rev, index + 1);
   }
}

