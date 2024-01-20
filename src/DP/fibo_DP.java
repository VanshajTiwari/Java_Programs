package DP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class fibo_DP {
    public static void main(String[] args) {
        int[] dp=new int[50000];
        Arrays.fill(dp,-1);
        System.out.println(fibo1(60,dp));
        System.out.println(fibo2(60));
    }
    public static int fibo1(int n,int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]= fibo1(n-1,dp)+fibo1(n-2,dp);
        return dp[n];
    }
    public static int fibo2(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
