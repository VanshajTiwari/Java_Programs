package Assignment;

import java.util.*;
public class Recursion_Convert_String_to_Integer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(convert2Int(input.next(),0));
    }
    public static int convert2Int(String num,int rev){
        if(num.isEmpty()){
            return rev;
        }
       rev=rev*10+num.charAt(0)-48;
       return convert2Int(num.substring(1),rev);
    }
}
