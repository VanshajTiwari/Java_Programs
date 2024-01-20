package RevRec;

public class Combination {
    public static void main(String[] args) {
        String str="abc";
        combin("",str);
    }
    public static void combin(String ans,String s){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String rs=s.substring(0,i)+s.substring(i+1);
            combin(ans+ch,rs);

        }
    }
}
