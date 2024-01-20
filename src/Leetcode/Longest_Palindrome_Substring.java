package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Longest_Palindrome_Substring {
    public static String longestPalindrome(String s) {
        int win_Size=s.length();
        String prac="";
        String ans="";
        while(win_Size>-1){

                prac=s.substring(0,win_Size);
            if(ans.length()>win_Size){
                return ans;
            }

            if(!prac.isEmpty() && checkPall(prac)){
                ans=prac;
            }

            for(int i=win_Size;i<s.length();i++){

                if(!prac.isEmpty()) {
                    prac += s.charAt(i);
                    prac = prac.substring(1);
                    if(checkPall(prac) && prac.length()>ans.length()){
                        ans=prac;
                    }
                }

            }
            prac="";
            win_Size--;
        }

        return ans;
    }

    public static void main(String[] args) {
       String a="abb";
        System.out.println(checkPall(a));
        System.out.println(longestPalindrome(a));
    }
    public static Boolean checkPall(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
