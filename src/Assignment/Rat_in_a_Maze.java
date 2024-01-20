package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Rat_in_a_Maze {
    static int count = 0;

    public static void main(String[] Vanshaj) {
        Scanner pin = new Scanner(System.in);
        int size = pin.nextInt(), m = pin.nextInt();

        String arr[] = new String[size];
        int ans[][] = new int[size][m];

        for (int t = 0; t < size; t++) {
            arr[t] = pin.next();
            int k[] = new int[m];
            Arrays.fill(k, 0);
            ans[t] = k;
        }

        ans[0][0] = 1;
        if (arr[0].charAt(0) == 'X' || arr[size - 1].charAt(m - 1) == 'X') {
            System.out.println("-1");
        } else {
            mazeRunner(size, m, arr, 0, 0, ans);
            if (count == 0) {
                System.out.println("-1");
            }
        }
    }

    static void mazeRunner(int num1, int num2, String arr[], int p, int q, int result[][]) {
        if (count > 0) return;

        if (p == num1 - 1 && q == num2 - 1) {
            if (result[p][q] == 1) {
                count++;
                for (int o = 0; o < num1; o++) {
                    for (int u = 0; u < num2; u++) {
                        System.out.print(result[o][u] + " ");
                    }
                    System.out.println();
                }
            }
            return;
        }
        if (arr[p].charAt(q) != 'X') {
            if (q + 1 <= num2 - 1 && result[p][q + 1] == 0) {
                            result[p][q + 1] = 1;
                            mazeRunner(num1, num2, arr, p, q + 1, result);
                            result[p][q + 1] = 0;
            }
            if (p + 1 <= num1 - 1 && result[p + 1][q] == 0) {
                                    result[p + 1][q] = 1;
                                    mazeRunner(num1, num2, arr, p + 1, q, result);
                                    result[p + 1][q] = 0;
            }
        }
    }


}
