package Leetcode;

import java.util.*;

public class Unique_Number_of_Occurrences {
    public static void main(String[] args) {
        int[] arr={-3,0,1,-3,1,1,-3,10,0};
        System.out.println(uniqueOccurrences1(arr));
    }
    public static boolean uniqueOccurrences(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
       for(int i=0;i<arr.length;i++){
           for(int j=i;j<arr.length;j++){
               if(arr[i]!=arr[j] && map.get(arr[i])==map.get(arr[j]))
                                  return false;
           }

       }
        return true;

    }

    public static boolean uniqueOccurrences1(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> st=new HashSet<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.values()){
            st.add(num);
        }
        return st.size()==map.values().size();
    }
}
