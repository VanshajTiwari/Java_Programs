import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1, 1,1};
        remover(arr);
    }

    public static int remover(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(Integer.MAX_VALUE);
        for (int i : arr) {
            arr1.add(i);
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (i+1<arr1.size() && arr1.get(i).equals(arr1.get(i + 1))) {
                arr1.remove(arr1.get(i));
                i=0;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(i+1<arr1.size())
                arr[i]=arr1.get(i+1);
            else{arr[i]=0;}
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr1);
        return arr1.size();
    }
}
