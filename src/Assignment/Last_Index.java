package Assignment;

import java.util.Scanner;

public class Last_Index {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=input.nextInt();
        int target=input.nextInt();
        System.out.println(lastIndex(arr,arr.length-1,target));
    }
    static int lastIndex(int[] arr,int index,int target){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return lastIndex(arr,--index,target);
    }
}
