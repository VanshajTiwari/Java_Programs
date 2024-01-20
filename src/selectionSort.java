import java.util.*;

public class selectionSort {
    public static void main(String[] args){
        int[] arr={2,4,1,10,3,6,8,10};

        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1,start=i;
            boolean flag=true;// ascending flag=true ;descending flag=false;

            int maxIndex=findmaxIndex(arr,last,start,flag);
            swap(arr,maxIndex,last,start,flag);
        }
        System.out.print(Arrays.toString(arr));
    }
    public static int findmaxIndex(int[] array,int end,int start,boolean flag){
        int max;
        if(flag){
            max=0;
        for(int i=1;i<=end-1;i++){
            if(array[max]<array[i]){
                max=i;
            }
        }}
        else{
            max=array.length-1;
            for(int i=start;i<array.length;i++){
                if(array[max]<array[i]){
                    max=i;
            }
        }

    }
        return max;
    }
    public static void swap(int[] array,int max,int end,int start,boolean flag ){
        if(flag){
        int temp=array[max];
        array[max]=array[end];
        array[end]=temp;}
        else{
            int temp=array[max];
            array[max]=array[start];
            array[start]=temp;}
    }

}
