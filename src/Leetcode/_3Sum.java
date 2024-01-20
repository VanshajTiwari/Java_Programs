package Leetcode;

import java.util.Arrays;
import java.util.List;

public class _3Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        combine(nums,0,"");
    }
    public List<List<Integer>> threeSum(int[] nums) {
        return null;
    }
    public static void combine(int[] nums,int sum,String ans){
        if(sum==0 && !ans.isEmpty()){
            System.out.println(ans);
            return;
        }
        if(sum>=Arrays.stream(nums).max().getAsInt()){
            return;
        }
            for(int i=0;i<nums.length;i++){
                combine(nums,sum+nums[i],ans+nums[i]);
            }
    }
}
