import java.util.*;

public class Rain_water_trapping {
public static void main(String[] args){
    int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
    trap(arr);
}
public static int trap(int[] nums){
    int result=0;
   int[] left=new int[nums.length],right=new int[nums.length];
   left[0]=nums[0];right[0]=nums[nums.length-1];
 for(int i=1;i<nums.length;i++){
    if(nums[i]>left[i-1]){
        left[i]=nums[i];
    }
    else{
        left[i]=left[i-1];
    }
 }
 for(int i=1;i<nums.length;i++){
     if(right[i-1]<nums[nums.length-1-i]){
         right[i]=nums[nums.length-1-i];
     }
     else{
         right[i]=right[i-1];
     }
 }
 for(int i=0;i<nums.length;i++){
     result+=Math.min(left[i],right[right.length-1-i])-nums[i];

 }


    return result;
}

}
