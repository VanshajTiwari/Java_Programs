package DP;

public class Stairs_problem {
    static int f1=0;
    static  int f2=0;
    public static void main(String[] args) {
        int[] dp= new int[50000] ;
        System.out.println( climbStairs(0,50,dp)) ;
    }
    public static int climbStairs(int n,int target,int[] dp){
        if(n>target){
            return 0;
        }
        if(n==target){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=climbStairs(n+1,target,dp)+climbStairs(n+2,target,dp);

    }
}
