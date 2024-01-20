package Leetcode;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] nums={-1};
        System.out.println(maxSubrray(nums));
    }
    public static int maxSubrray(int[] nums){
        int win_Size=0;
        int max_sum=Integer.MIN_VALUE;
        int sum=0;
        while(++win_Size<=nums.length){
        for(int i=0;i<win_Size;i++){
            sum+=nums[i];
        }
        max_sum=Math.max(sum,max_sum);
        for(int i=win_Size;i<nums.length;i++){
            sum-=nums[i-win_Size];
            sum+=nums[i];
            max_sum=Math.max(max_sum,sum);
        }
        sum=0;
        }
        return max_sum;
    }
}
