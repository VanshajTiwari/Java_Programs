package RevRec;

import java.util.ArrayList;

public class GenerateParenthesis {
    public static void main(String[] args) {
        ArrayList<String> Arr=new ArrayList<>();
        generate(3,"",0,0,Arr);
        System.out.println(Arr);
    }
    public static void generate(int n,String ans,int open,int close,ArrayList<String> Arr){
        if(n==open && n==close){
            Arr.add(ans);
            System.out.println(ans);
            return;
        }
        if(open>n || open<close)
            return;
        generate(n,ans+"{",open+1,close,Arr);
        generate(n,ans+"}",open,close+1,Arr);
    }
}

