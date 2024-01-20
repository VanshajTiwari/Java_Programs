import java.util.*;
public class searching {
   public static void main(String[] args){
       int[] arr={12,9,-1,-23,45};
       System.out.println( findminele(arr));
       System.out.println(findMaxElement(arr));
    }


    public static void inputpro(){
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    int[] arr=new int[num];
        for(int i=0;i<num;i++){
        arr[i]=input.nextInt();
    }
        System.out.print("Enter ELement for search :) ");
        int ele=input.nextInt();
        System.out.print(linearSearch(arr,ele));}
    public static int linearSearch(int[] arr,int element){
        for(int i=0;i<arr.length;++i){
            if(arr[i]==element){
                return i;
            }
            else if(i==arr.length-1){
                return -1;
            }
        }
        return -1;
    }
    public static int findminele(int[] arr){
        int len=arr.length,minu=arr[0];
        for(int i=1;i<len;i++)
            minu=(minu<arr[i])?minu:arr[i];
        return minu;

    }
    public static int findMaxElement(int[] arr){
        int len=arr.length;
        int maxo=arr[0];
        for(int i:arr)
        maxo=(maxo>i)?maxo:i;
        return maxo;
    }
}
