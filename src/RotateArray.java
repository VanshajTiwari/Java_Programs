import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rotateArray(arr,k);


    }


  static void rotateArray(int[] nums,int k){
      int a=0;
      while(a< k){
            int last=nums[nums.length-1];
            for(int i=nums.length-1;i>=1;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=last;
            a++;

        }
      System.out.println(Arrays.toString(nums));
  }

}
