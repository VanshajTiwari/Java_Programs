package Assignment;

import java.util.*;
import java.util.Collections;

public class Dictionary_Order_Larger {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String abc=input.next();


       List<String> result=permutationsList("",abc);
       Collections.sort(result);
       System.out.println(result);
       for(int i=0;i<result.size();i++){
           if(result.get(i).equals(abc)){
               System.out.println(result.get(i+1));
           }
       }
    }
    static List<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }



}
