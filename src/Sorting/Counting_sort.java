//package Sorting;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Counting_sort {
//    public static void main(String[] args) {
//        int[] Arr={2,1,1,0,1,2,5,4,0,2,8,2,7,9,6,1,9};
//        Arr=Sort(Arr);
//    }
//    public static int[] Sort(int[] arr){
//        int max= Arrays.stream(arr).max().getAsInt();
//        int[] freq=new int[max+1];
//        for(int i=0;i<arr.length;i++){
//            freq[arr[i]]++;
//        }
//
//        for(int i=1;i<freq.length;i++){
//            freq[i]=freq[i-1]+freq[i];
//        }
//        return new int[];
//    }
//}
