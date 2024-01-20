package RevRec;

public class Permutation {
    public static void main(String[] args) {
        permute("abca","");
    }
    public static void permute(String t,String ans){
        if(t.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            String rs=t.substring(0,i)+t.substring(i+1);

            permute(rs,ans+ch);
        }
    }
}
