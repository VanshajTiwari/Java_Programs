import java.util.*;

public class bubbleSort {
public static void main (String[] args){
    Scanner input=new Scanner(System.in);
    int[] arr={3,7,1,5,9,7,11,12,6};
    System.out.println(Arrays.toString(ascendingSort(arr)));
    System.out.println(Arrays.toString(decendingSort(arr)));
}
public static int[] ascendingSort(int[] array) {
    int temp;
    for (int i = 1; i < array.length; i++) {
        for (int j = 0; j < array.length-1; j++) {
            if (array[j] > array[i]) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
    }
    return array;
}
    public static int[] decendingSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] < array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
