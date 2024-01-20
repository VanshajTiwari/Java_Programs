import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args){
        int[] arr={1,1,1,1,1};
        System.out.println(Arrays.toString(sum(arr)));
    }
    public static int[] sum(int[] nums){
            for(int i=1;i<nums.length;i++){
                nums[i]=Add(nums[i],nums[i-1]);
            }
            return nums;
        }
        static int Add(int x, int y)
        {
            while (y != 0)
            {
                int _0 = x & y;
                x = x ^ y;
                y = _0 << 1;
            }
            return x;
        }

}
