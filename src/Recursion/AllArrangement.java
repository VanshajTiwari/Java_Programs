package Recursion;

public class AllArrangement {
    public static void main(String[] args) {
        arrangement("abc","");

    }
    public static void arrangement(String ex,String ans){
        if(ex.isEmpty()) {
            System.out.println(ans);
            return;
        }
        boolean flag=true;
        for(int i=0;i<ex.length();i++){
            char ch=ex.charAt(i);
            for(int j=i+1;j<ex.length();j++){
                if(ch==ex.charAt(j)){
                    flag=false;
                break;}
            }
            if(flag){
            arrangement(ex.substring(1),ans+ch);
            arrangement(ex.substring(1),ans);}}
        }

    }

