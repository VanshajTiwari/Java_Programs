package Recursion;

public class binarySearchByRec {
    public static void main(String[] args) {
        int[] abc={1,2,3,4,5,5,6,7,80};
        int target=80;
        System.out.println(binarySearch(abc,target,0,abc.length-1));
    }
    public static int binarySearch(int[] arr,int target,int start,int end){
        if(start>end){
            return  -1;
        }
        int m=start+(end-start)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return binarySearch(arr,target,start,m-1);
        }
        return binarySearch(arr,target,m+1,end);
}
}
