package Leetcode;

public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="fa";
        System.out.println(longestCommonSubsequence(s1,s2));
    }
    public static int longestCommonSubsequence(String text1, String text2) {
            int len=text2.length();
            int idx=0;
            for(int i=0;i<text1.length();i++){
                if(len==0)
                    return text2.length()-len;
                if(text1.charAt(i)==text2.charAt(idx)) {
                    --len;++idx;
                }

            }
            if(len==0)
                return text2.length();
            else{
                return text2.length()-len;
            }

    }
}
