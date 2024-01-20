package Recursion;

public class SkipChar {
    public static void main(String[] args) {
        skip("vanshhaj","");
        System.out.println(skip("Vanshaj",'a',0,""));
        System.out.println(skip("aVanasahaja"));
        System.out.println(skipString("baskbasbaappleappleans"));
    }
    static String skip(String str,char target,int a,String ans){
        if(a==str.length()){
            return ans;
        }
        if(str.charAt(a)!=target){
            ans+=Character.toString(str.charAt(a));
        }
      return   skip(str,target,++a,ans);
    }
    static void skip(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char a=str.charAt(0);
        if(a=='a'){
            skip(str.substring(1),ans);
        }
        else{

            skip(str.substring(1),ans+a);
        }
    }
    static  String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        char a=str.charAt(0);
        if(a=='a'){
            return skip(str.substring(1));
        }
        else{return a+ skip(str.substring(1));
        }
    }
    static String skipString(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipString(str.substring(5));
        }
        else{
            return str.charAt(0)+skipString(str.substring(1));
        }
    }
}
