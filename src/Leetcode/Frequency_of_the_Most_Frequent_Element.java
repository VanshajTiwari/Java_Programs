package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Frequency_of_the_Most_Frequent_Element {
    public static int maxFrequency(int[] nums,int k){
        int run=0;
        int max= Arrays.stream(nums).max().getAsInt();

        for(int i=0;i<nums.length;i++){
            while(++run<=k){
                if(max!=nums[i])
                    nums[i]+=1;
        }
            run=0;
        }
        int[] arr=new int[500000];
        for(int i:nums){
            arr[i]+=1;
        }
        for(int i:nums){
            if(arr[i]!=1){
                return arr[i];
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] nums={3,9,6};
        int op=7;
        System.out.println(maxFrequency(nums,op));
    }
}
