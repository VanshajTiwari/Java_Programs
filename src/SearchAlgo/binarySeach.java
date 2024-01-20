package SearchAlgo;

import java.util.HashMap;

public class binarySeach {
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int target=14;
        BS(arr,target);
    }
    public static void BS(int[] arr,int target){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target)
                end=mid-1;

            if(arr[mid]<target)
                start=mid+1;

            if(arr[mid]==target) {
                System.out.println(mid);
                return;
            }

        }
        System.out.println(-1);
        return;
    }
}
