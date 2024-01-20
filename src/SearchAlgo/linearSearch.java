package SearchAlgo;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=20;
        find(arr,target);
    }
    public static void find(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        return;
    }
}
