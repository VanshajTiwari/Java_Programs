package Leetcode;

import java.util.ArrayList;

public class Find_Unique_Binary_String {
    public static void main(String[] args) {
        String[] Arr={"0"};
        String rs="";
        for(int i=0;i<Arr[0].length();i++){
            rs+="0";
        }
        System.out.println(rs);
        ArrayList<String> resultant=combinations("",rs,new ArrayList<>());
        System.out.println(checker(resultant,Arr));
        System.out.println(resultant);
        System.out.println(findDifferentBinaryString(Arr));
    }

     private static String checker(ArrayList<String> resultant, String[] arr) {

        for(String i:resultant){
            boolean flag=true;
            for(String j:arr){
                if(i.equals(j) && flag ){
                    flag=false;
                }

            }
            if(flag==true){
                return i;
            }
        }
        return "";
    }

    public static ArrayList combinations(String ans, String s, ArrayList<String> arr){
        if(s.isEmpty()){
            arr.add(ans);
            return arr;
        }
        combinations(ans+"0",s.substring(1),arr);
        combinations(ans+"1",s.substring(1),arr);
        return arr     ;
    }


    public static String findDifferentBinaryString(String[] nums) {
            StringBuilder str=new StringBuilder();
            for(int i=0;i<nums.length;i++)
                str.append(nums[i].charAt(i)=='0'?1:0);

            return new String(str);
    }
}
