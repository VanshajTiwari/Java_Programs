package Recursion;


public class coinTossNo2Heads {
    public static void main(String[] args) {
        tossing("",3);
    }
    public static void tossing(String ans,int num){
        if(num==0){
            System.out.println(ans);
            return;
        }
        if(ans.isEmpty() || ans.charAt(ans.length()-1)!='H'){
            tossing(ans+'H',num-1);
        }
        tossing(ans+"T",num-1);
    }
}
