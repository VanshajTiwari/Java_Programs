package RevRec;

public class duplicate_Permutation {
     public static void main(String[] args) {
    permute("abca","");
}
    public static void permute(String t,String ans){
        if(t.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int j=0;j<t.length();j++){
            char ch = t.charAt(j);
            boolean flag=true;
            for(int i=j+1;i<t.length();i++) {
                if(t.charAt(i)==ch){
                    flag=false;
                    break;
                }
            }
            if(flag){
                String rs=t.substring(0,j)+t.substring(j+1);

            permute(rs,ans+ch);}

        }
    }
}

