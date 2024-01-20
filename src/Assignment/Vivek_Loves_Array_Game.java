package Assignment;
import java.util.*;
public class Vivek_Loves_Array_Game {
    public static int func(int numbers[], int starting, int ending) {
        if (starting == ending) return 0;
        long sum = 0;
        long subarraysum = 0;

        for (int i = starting; i <=ending; i++) {
            sum += numbers[i];
        }

        if (sum % 2 == 1) return 0;
        sum = sum / 2;

        for (int i = starting; i < ending; i++) {
            subarraysum += numbers[i];
            if (subarraysum == sum) {
                return 1 + Math.max(func(numbers, starting, i), func(numbers, i+1, ending));
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int numbers[] = new int[n];
            for (int j = 0; j < n; j++) {
                numbers[j] = in.nextInt();
            }
            System.out.println( func(numbers, 0, n - 1));
        }
    }
}
