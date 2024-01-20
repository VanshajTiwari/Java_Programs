package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Minimum_Index_Sum_of_Two_Lists {
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"},
                list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }
    public static String[] findRestaurant(String[] list1,String[] list2){
        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    map.put(list1[i],i+j);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i:map.values()){
            if(min>i){
                min=i;
            }
        }
        ArrayList<String> minini=new ArrayList<>() ;
        for(String key:map.keySet()){
            if(map.get(key)==min){
                minini.add(key);
            }
        }


    return minini.toArray(new String[minini.size()]);
    }
}