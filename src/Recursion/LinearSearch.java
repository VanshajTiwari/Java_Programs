package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,130};

        System.out.println(linearSearch(arr,7,0));
    }
    static int linearSearch(int [] arr,int target,int num){
        if(num==arr.length){
            return -1;
        }
        else if(arr[num]==target){
            return num;
        }
        return linearSearch(arr,target,num+1);
    }
}
