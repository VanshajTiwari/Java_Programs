package Assignment;

import java.util.*;

public class Vivek_Loves_Array_Game {
    public static int VivekKaPyar(int numbers[], int ini, int fini) {
        if (ini == fini)
            return 0;
        long ujm = 0;
        long subArrAdd = 0;

        for (int i = ini; i <= fini; i++) {
            ujm += numbers[i];
        }

        if (ujm % 2 == 1) return 0;
        ujm = ujm / 2;

        for (int i = ini; i < fini; i++) {
            subArrAdd += numbers[i];
            if (subArrAdd == ujm) {
                return 1 + Math.max(VivekKaPyar(numbers, ini, i), VivekKaPyar(numbers, i + 1, fini));
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner inputc = new Scanner(System.in);
        int num = inputc.nextInt();

        for (int i = 0; i < num; i++) {
            int number = inputc.nextInt();
            int listArr[] = new int[number];
            for (int ipc = 0; ipc < number; ipc++) {
                listArr[ipc] = inputc.nextInt();
            }
            System.out.println(VivekKaPyar(listArr, 0, number - 1));
        }
    }
}
