package Assignment;

import java.util.*;

public class Dictionary_Order_Smaller {


    static void ORderSmmaLL(String str, String Faaltu, List<String> result, String strResUt) {

        int lengthO = str.length();

        if (strResUt.length() == lengthO) {

            int karoTest = str.compareTo(strResUt);

            if (karoTest >= 1) {
                result.add(strResUt);
            }

            return;

        }


        for (int i = 0; i <= Faaltu.length() - 1; i++) {

            ORderSmmaLL(str, Faaltu.substring(0, i) + Faaltu.substring(i + 1), result, strResUt + Faaltu.charAt(i));

        }

    }


    public static void main(String Coding[]) {
        // Your Code Here

        Scanner inp = new Scanner(System.in);

        String s = inp.next();

        String temp = s;

        List<String> ans = new ArrayList<>();
        ORderSmmaLL(s, temp, ans, "");

        ans.sort(null);

        for (int i = 0; i < ans.size(); i++) {


            System.out.println(ans.get(i));

        }

        inp.close();

    }

}