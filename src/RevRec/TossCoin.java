package RevRec;

import java.sql.SQLOutput;

public class TossCoin {
    public static void main(String[] args) {
        String A="AbcDf";
        String SS="HT";
        tossing(3,"");
    }
    public static void tossing(int num,String ans){
        if(num==0) {
//            if(ans.substring(0,2).equals("HH"))

            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
            tossing(num-1,ans+"H");
        tossing(num-1,ans+"T");

    }
}
