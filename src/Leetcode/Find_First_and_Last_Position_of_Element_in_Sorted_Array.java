package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] arr={8};
        System.out.println(Arrays.toString(searchRange(arr,8))) ;
    }
    public static int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> Arr=new ArrayList<>();
        Boolean flagstart=true;
        Boolean flagend=true;
        for(int i=0;i<nums.length;i++){
            System.out.println(i);
            if(nums[i]==target && flagstart){
                Arr.add(i);
                flagstart=false;
            }
            if(nums[nums.length-1-i]==target && flagend){
                Arr.add(nums.length-1-i);
                flagend=false;
                }
        }
        if(Arr.size()==0){
            Arr.add(-1);
            Arr.add(-1);
        }
        if(Arr.size()==1){
            Arr.add(Arr.get(0));
        }
        int[] newArr=new int[Arr.size()];

        for(int i=0;i<newArr.length;i++){
            newArr[i]=Arr.get(i);
        }
        Arrays.sort(newArr);
       return newArr;
    }
}
