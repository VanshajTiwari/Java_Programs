import java.util.Arrays;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(search(nums, 1));

    }

    public static int search(int[] nums, int target) {
        if (nums.length == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target)
                    return i;
            }
        }
        if (nums[0] == 0) {
            if (target < nums.length - 1 && nums[target] == target) {
                return target;
            } else {
                return -1;
            }
        } else {
            int start = nums.length - nums[0] + 1;
            int range = nums.length - nums[0];
            int[] arr1 = new int[range], arr2 = new int[nums.length - range];
            for (int i = 0; i < range; i++) {
                arr1[i] = nums[i];
            }
            for (int i = range; i < nums.length; i++) {
                arr2[i - range] = nums[i];
            }
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
            if (target <= arr2.length - 1 && arr2[target] == target) {
                return start + target;
            } else if (target + arr1[0] < arr1.length - 1 && arr1[target + arr1[0]] == target) {
                return target + arr1[0];
            } else return -1;
        }
    }
}
