package DP;

public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        int cost[]={10,15,20};
        System.out.println(climbing(cost,0));
    }
    public static int climbing(int[] arr,int i){
        if(i>arr.length-1)
            return 0;
        if(i==arr.length-1)
            return 1;
       int path1=arr[i+1]+climbing(arr,i+1);
       int path2=arr[i+2]+climbing(arr,i+2);
       return Math.min(path2,path1);
    }
}
