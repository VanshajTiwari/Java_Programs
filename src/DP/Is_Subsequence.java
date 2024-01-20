package DP;

public class Is_Subsequence {
    public static void main(String[] args) {
        System.out.println(method("",""));
    }
    public static boolean method(String s,String t){
        int l=t.length();
        boolean flag=false;
        int o=0;
        System.out.println(l);
        
        for(int i=0;i<s.length();i++){
            if(l==0)
                return true;
            if(s.charAt(i)==t.charAt(o)){
                System.out.println(s.charAt(i)+"      "+t.charAt(o));
                o++;
                l--;
                flag=true;
            }
            else{
                flag=false;
            }
        }
        if(flag && l==0)
            return true;
        return false;
    }
}
