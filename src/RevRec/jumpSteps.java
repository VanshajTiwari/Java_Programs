package RevRec;

public class jumpSteps {
    static int count=0;
    public static void main(String[] args) {
        System.out.println(jump(4,0,"")); ;
        System.out.println(count);
    }
    public static int  jump(int n,int ans,String S){
        if(n==ans){
            System.out.println(S);
            count++;
            return 1;
        }
        if(ans>n){
            return 0;
        }
        int fs=jump(n,ans+1,S+" 1");
        int fr=jump(n,ans+2,S+" 2");
        int ff=jump(n,ans+3,S+" 3");
        return fs+fr+ff;
    }
}
