package Assignment;

import java.util.Scanner;
import java.util.Stack;

public class First_Index {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=input.nextInt();
        int target=input.nextInt();
        System.out.println(firstIndex(arr,0,target));

    }
    static int firstIndex(int[] arr,int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return firstIndex(arr,++index,target);
    }


}
