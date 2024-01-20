package Leetcode;

public class Permutation_Sequence {

    public static void main(String[] args) {
        permute(3,3);
    }
    public static void permute(int num,int k){
        String str = "";
        for(int i=1;i<=num;i++){
            str+=Integer.toString(i);
        }
        System.out.println("passsed :"+str);
        mainperute(str,k,"");
    }
    public static void mainperute(String str,int k,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            String processtr=str.substring(0,i)+str.substring(i);
           mainperute(processtr.substring(1),k,ans+ch);

        }

    }
}
