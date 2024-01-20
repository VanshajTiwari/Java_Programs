package RevRec;

public class pow {
    public static void main(String[] args) {
        System.out.println(powfunction(1,5));
    }
    public static int powfunction(int a,int n){
        if(a==0){
            return 0;
        }
        if(n==0 || a==1)
            return 1;
        int res=a*powfunction(a,n-1);
       // int res1=a*powfunction(a,n-1);
        return res;
    }
}
