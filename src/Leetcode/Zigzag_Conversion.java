package Leetcode;

public class Zigzag_Conversion {
    public static void main(String[] args) {
        int numRows=3;
        String s="PAYPALISHIRING";
        System.out.println(convert(s,numRows));
    }
    public static String convert(String s, int numRows) {
            int i=-1;
            String rs="";
        int interval=numRows;
        boolean flag=false;
            while(i++<numRows){


                for(int j=i;j<s.length();j+=interval+1){
                    if(j>=s.length())
                        break;
                    rs+=s.charAt(j);
            }
    }
            return rs;
    }
}
