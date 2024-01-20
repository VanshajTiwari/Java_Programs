package RevRec;

public class firstOccurrence {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5,6};
        System.out.println(finder(arr,8,0));
    }
    public static int finder(int[] Arr,int f,int i){
        if(i==Arr.length){
            return -1;
        }
        if(Arr[i]==f){
            return i;
        }

        return finder(Arr,f,i+1);
    }
}
