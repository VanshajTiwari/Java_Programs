package Recursion;

public class IndexOfElement {
    public static void main(String[] args) {
        int[] Arr={1,2,3,4,5,6,7,8};
        System.out.println(findIndex(10,Arr,0));
    }
    public static int findIndex(int k,int[] Arr,int i){
        if(i==Arr.length){
            return  -1;
        }
        if(Arr[i]==k){
            return i;
        }
        return findIndex(k,Arr,++i);
    }
}
