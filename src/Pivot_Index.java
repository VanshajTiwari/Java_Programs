public class Pivot_Index {
    public static void main(String[] args){
        int arr[]={2,1,-1};
        System.out.println(pivotIndex(arr));
    }
    public static int pivotIndex(int[] nums) {
        int s=0;

           for(int i=0;i<nums.length;i++){
               int sio=0;
               s+=nums[i];
               for(int j=nums.length-1;j>=nums.length;j--){
                   sio+=nums[j];
                    if(s<sio)
                        System.out.print("");
                    else if(s==sio)
                        return i+1;
               else if(j==i){break;}}
           }
           return -1;
    }
}
