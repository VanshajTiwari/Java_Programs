package Leetcode;
import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={0};
        int[] nums2={2};
        merge(nums1,0,nums2,1);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n>0){

            for(int i=m,k=0;i<nums1.length;i++,k++){

                System.out.println(i+" "+k);
                nums1[i]=nums2[k];
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
