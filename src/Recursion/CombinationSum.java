package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static List<List<Integer>> rsF=new ArrayList<>();
    public static void main(String[] args) {
        int[] Arr={2,3,6,7};
        System.out.println(  combination(Arr,7,"",0));
    }
    public static List<List<Integer>> combination(int[] Arr, int target, String ans, int sum){
        ArrayList<Integer> rs=new ArrayList<>();
        if(target==sum){
            for(int j=0;j<ans.length();j++){
                rs.add(ans.charAt(j)-48);
            }
            rsF.add(rs);
            return rsF;
        }
        if(target<sum){

            return rsF;
        }

        for(int i=0;i<Arr.length;i++){

           combination(Arr,target,ans+Arr[i],sum+Arr[i]);

        }

return rsF;
}
}
