package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
            int[] nums={10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums){
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<i;j++)
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }

        }
       int ans=1;
        for(int i=0;i<dp.length;i++){
            if(dp[i]>ans){
                ans=dp[i];
            }
        }
        return ans;
    }

}
