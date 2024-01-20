import java.util.*;
public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args){
        int[] num1={1,3},num2={2,4};
        System.out.println(String.format(".5f%",findMedianSortedArrays(num1,num2)));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergeArr= new int[nums1.length+nums2.length] ;
        for(int i=0;i<nums1.length;i++){
            mergeArr[i]=nums1[i];

        }

        for(int i=0;i<nums2.length;i++){
            mergeArr[nums1.length+i]=nums2[i];

        }
        Arrays.sort(mergeArr);
        System.out.println(Arrays.toString(mergeArr)+" "+mergeArr.length);
       if(mergeArr.length%2!=0){
         return  (double)(mergeArr[((mergeArr.length-1)/2)]);
       }
       else{

           int a=mergeArr[mergeArr.length/2-1];
           int b=mergeArr[(mergeArr.length/2)];
System.out.println(a+"  "+b);
           return (double)(a+b)/2;

    }}
}
