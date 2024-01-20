package Recursion;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr={14,13,12,11,10,9,8};
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int[] arr){
      return isAscending(arr,0) || isDescending(arr,0);
    }
    static boolean isAscending(int[] arr,int num){
        if(num==arr.length-1)
            return true;
        return arr[num]<arr[num+1] && isAscending(arr,num+1);
    }
    static boolean isDescending(int[] arr,int num){
        if(num==arr.length-1)
            return true;
        return arr[num]>arr[num+1] && isDescending(arr,num+1);
    }
}
