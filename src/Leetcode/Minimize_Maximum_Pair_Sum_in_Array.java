package Leetcode;

import java.util.Arrays;

public class Minimize_Maximum_Pair_Sum_in_Array {
    public static void main(String[] args) {
            int[] nums={3,5,2,3};
        System.out.println(miniPairum(nums));
    }
    public static int miniPairum(int[] nums){
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            max=Math.max(max,nums[i]+nums[nums.length-1-i]);
        }
        return max;
    }
}
