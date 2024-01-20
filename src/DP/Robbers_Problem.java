package DP;

import java.util.Arrays;

public class Robbers_Problem {
    public static void main(String[] args) {
        int arr[]={5,2,3,11};
        int i=0;
        int dp[]=new int[50000];
        Arrays.fill(dp,-1);
        System.out.println(robber(arr,i,dp));
    }
    public static int robber(int[] arr,int i,int[] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1)
            return dp[i];
        int rob=arr[i]+robber(arr,i+2,dp);
        int dont=robber(arr,i+1,dp);
        return dp[i]=Math.max(rob,dont);
    }
}
