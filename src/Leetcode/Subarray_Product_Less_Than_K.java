package Leetcode;

import java.sql.SQLOutput;

public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
        int[] nums={10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        System.out.println(numSubarrayProductLessThanK(nums,19));
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int len=1;
        int count=0;
        while(len<=nums.length){
            double prod=1;
            for(int i=0;i<len;i++){
                prod*=nums[i];
            }
            if(prod<k){
                ++count;
            }
            for(int i=len;i<nums.length;i++){
                prod*=nums[i];
                prod/=nums[i-len];
                if(prod<k){
                    System.out.println(prod+"    "+len);
                    ++count;}

            }
            ++len;
        }
        return count++;
    }
}
