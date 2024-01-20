package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] Arr={1,2,3,4,6,6};
        System.out.println(containsDuplicate(Arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        return set.size()!=nums.length;
    }
    public static boolean containsDuplicateII(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num=0;num<nums.length;num++){
            if(map.containsKey(nums[num])){
                int j=map.get(nums[num]);
                if(Math.abs(num-j)<=k){
                    return true;
                }
                map.put(nums[num],num);
            }
            else
                map.put(nums[num],num);
        }
        return false;
    }
}
