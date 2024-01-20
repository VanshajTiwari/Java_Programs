package Assignment;

import java.util.*;

public class Recursion_Keypad_Codes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> result=padRet("", input.next());
        for(String i:result){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(result.size());
    }

    static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }


}
