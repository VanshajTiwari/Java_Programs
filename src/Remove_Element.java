import java.util.*;

public class Remove_Element {
    public static void main(String[] args) {
        int[] num = {4,2,0,5};
        int num1 = 5;
        System.out.println(removeElement0(num, num1));
        System.out.println(Arrays.toString(num));
    }

    public static int removeElement0(int[] nums, int val) {
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        for (int i : nums) {
            if (i == val) {
                count++;
            }

            result.add(i);
        }
        int i = 0;
        for (i = 0; i < count; i++) {
            result.removeIf(name -> name.equals(val));
        }

        for (i = 0; i < nums.length; i++) {
            if (i < result.size()) {
                nums[i] = result.get(i);
            } else {
                nums[i] = 0;
            }
        }
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
        return result.size();
    }

}


