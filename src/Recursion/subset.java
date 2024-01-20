package Recursion;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        subsetfun("abcd", "");
       // System.out.println(subsetfunArr("abc",""));
    }

    static void subsetfun(String str, String abc) {
        if (str.isEmpty()) {
            System.out.println(abc);
            return;
        }
        subsetfun(str.substring(1), abc + str.charAt(0));
        subsetfun(str.substring(1), abc);

    }
    static ArrayList<String> subsetfunArr(String str, String abc) {
        if (str.isEmpty()) {
            ArrayList<String> result=new ArrayList<>();
            result.add(abc);
            return result;
        }
       ArrayList<String> left=subsetfunArr(str.substring(1), abc + str.charAt(0));
       ArrayList<String>right=subsetfunArr(str.substring(1), abc);
        left.addAll(right);
        return left;
    }
}
