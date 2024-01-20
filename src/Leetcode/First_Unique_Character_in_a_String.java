package Leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));

    }
    public static int firstUniqChar(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int l=-1;
        for(char i:map.keySet()){
            if(map.get(i)==1){

                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)==i){
                        l=j;
                        return l;}
                }
            }
        }
        System.out.println(map);
        return l;
    }
}
