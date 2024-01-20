package Leetcode;

import java.util.HashMap;

public class Count_Number_of_Homogenous_Substrings {

    public static void main(String[] args) {
        String s="abbcccaa";
//        System.out.println(countHomogenous(s));
        method1(s);
    }
    public static int countHomogenous(String s) {
        int count=1;
        int counter=0;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){

                count++;
                System.out.println(s.charAt(i)+"  "+s.charAt(i-1)+" Count :"+count);
                counter+=count;
            }
            else{

                count=1;
                System.out.println(s.charAt(i)+"  "+s.charAt(i-1)+" Count :"+count);
            }
        }
        return counter;


    }
    public static void method1(String s){
        //   abbcccaa
        HashMap<String,Integer> map=new HashMap<>();
        String str="";
        for(int i=0;i<s.length();i++){
            if(i==0){
                str+=s.charAt(i);
                map.put(str+"",1);
            }
            else if(s.charAt(i)==s.charAt(i-1)){
                str+=s.charAt(i);
                System.out.println(str);
                map.put(str,map.getOrDefault(map.get(str),1)+1);
            }
            else{
                System.out.println(str +" INE ELS");
                str="";
            }
        }
        System.out.println(map);
    }
}
