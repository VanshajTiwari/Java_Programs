package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] Arr1={1,2,3,5};
        int[] Arr2={2,2,4,6,7};
        System.out.println(Arrays.toString(mergeSortedArr(Arr1, Arr2)));

    }

    private static int[] mergeSortedArr(int[] arr1, int[] arr2) {
        int len1=arr1.length;
        int len2=arr2.length;
        int[] ArrRS=new int[len1+len2];
        int lenO1=0;
        int lenO2=0;
        int lenOm=0;
        while(lenO1<len1 && lenO2<len2){
            if(arr1[lenO1]<=arr2[lenO2]){
                ArrRS[lenOm]=arr1[lenO1];
                ++lenO1;
                ++lenOm;
            }
            else{
                ArrRS[lenOm]=arr2[lenO2];
                ++lenO2;
                ++lenOm;}
        }
        while(lenO1<len1){
            ArrRS[lenOm]=arr1[lenO1];
            ++lenO1;
            ++lenOm;
        }
        while(lenO2<len2){
            ArrRS[lenOm]=arr2[lenO2];
            ++lenO2;
            ++lenOm;
        }
        System.out.println(ArrRS[2]);
        return ArrRS;
    }

}
