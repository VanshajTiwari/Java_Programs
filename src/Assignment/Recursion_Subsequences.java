package Assignment;

import java.util.*;

public class Recursion_Subsequences {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        ArrayList<String> result=subsetfunArr(str,"");
        for(String i:result)
            System.out.print(i+" ");
        System.out.println();
        System.out.println(result.size());
    }
    static ArrayList<String> subsetfunArr(String str, String abc) {
        if (str.isEmpty()) {
            ArrayList<String> result=new ArrayList<>();
            result.add(abc);
            return result;
        }
        ArrayList<String> left=subsetfunArr(str.substring(1), abc );
        ArrayList<String>right=subsetfunArr(str.substring(1), abc+ str.charAt(0));
        left.addAll(right);
        return left;
    }

}
