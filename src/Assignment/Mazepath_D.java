package Assignment;

import java.util.*;

public class Mazepath_D {
        static int numbercount = 0;

        public static void khulJaSimSim(int n, int m, int i, int j, String ans) {
            if (i == n && j == m) {
                System.out.print(ans + " ");
                Mazepath_D.numbercount++;
                return;}
            if (i < n) {

                khulJaSimSim(n, m, i + 1, j, ans + "V");}
            if (j < m) {

                khulJaSimSim(n, m, i, j + 1, ans + "H");}
            if (i < n && j < m) {

                khulJaSimSim(n, m, i + 1, j + 1, ans + "D");
        }
    }
    static void fun(){
            System.out.println();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // Your Code Here

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        khulJaSimSim(num1 - 1, num2 - 1, 0, 0, "");
        fun();
        System.out.print(numbercount);

    }
}
