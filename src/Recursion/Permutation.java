package Recursion;



public class Permutation {
    public static void main(String[] args) {permute("abca","");
    }
    public static void permute(String a,String ans){
        if(a.isEmpty()){
            //if(ans.isEmpty() || ans.charAt(ans.length()-1)!=ans.charAt(0)){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<a.length();i++){
        char ch=a.charAt(i);
        boolean flag=true;
        for(int j=i+1;j<a.length();j++){
        if(a.charAt(j)==ch){flag=false;break;}}
        if(flag){
        String ros=a.substring(0,i)+a.substring(i+1);
        permute(ros,ans+ch);
        }}
    }


}
