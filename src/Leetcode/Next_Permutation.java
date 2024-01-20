package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Next_Permutation {
    public static void main(String[] args) {
        int[] nums={3,2,1};
         nextPermutation(nums);
    }
    public static void nextPermutation(int[] nums) {
        String rs="";
        for(int i:nums){
            rs+=i;
        }
        HashSet<String> rset=new HashSet<>() ;
        rset.add(rs);
        System.out.println(rset);
        combined(rset,"",rs,rs);
        System.out.println(rset);
        for(String i:rset){

            rs=i;
            break;
        }
        System.out.println(rs);
        int[] res=new int[rs.length()];
        for(int i=0;i<rs.length();i++){
            nums[i]=rs.charAt(i)-48;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void combined(HashSet<String> rset,String ans,String str,String main) {
        if (str.isEmpty()) {
            if (!rset.contains(ans))

                rset.add(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rs = str.substring(0, i) + str.substring(i + 1);
            combined(rset, ans + ch, rs, main);

        }
        //     return combined(rset,ans,"",main);    }
    }
}

