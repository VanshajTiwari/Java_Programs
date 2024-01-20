package RevRec;

public class subsequence {
    public static void main(String[] args) {
        sequence("","abc");
    }
    public static void sequence(String ans,String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        sequence(ans+str.charAt(0),str.substring(1));
        sequence(ans,str.substring(1));
//        char ch=str.charAt(0);
//        sequence(str.substring(1),ans+ch);
//        sequence(str.substring(1),ans);
    }
}
