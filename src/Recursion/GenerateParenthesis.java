package Recursion;

public class GenerateParenthesis {
    public static void main(String[] args) {
            generator(0,0,1,"");
    }
    public static void generator(int opening,int closing,int n,String ans){
        if(opening==n && closing==n){
            System.out.println(ans);
            return;
        }
        if(opening<n){
            generator(opening+1,closing,n,ans+'(');
        }

        if(closing<opening){
            generator(opening,closing+1,n,ans+')');
        }
    }
}
