import java.util.*;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] arr = {"a"};

        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<String> abs;
        boolean[] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            abs=new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {

                if (checker(arr[i], arr[j]) && arr1[j] == false) {
                    arr1[j] = true;
                    abs.add(arr[j]);
                }
            }

            if (!abs.isEmpty()) {
                result.add(abs);

            }

        }
        System.out.println(result);

    }

    public static boolean checker(String s, String t) {
        int[] arr = new int[256];
        boolean valid = true;
        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                int a = s.charAt(i);

                arr[a]++;

            }
            for (int i = 0; i < s.length(); i++) {
                int a = t.charAt(i);
                arr[a]--;

            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    valid = false;
                    break;
                }
            }


        } else {

            return false;
        }

        if (valid) {

            return true;
        }
        return false;
    }
}

