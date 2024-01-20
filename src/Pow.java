public class Pow {
    public static void main(String[] args){
        System.out.format("%.5f",pow(2,-2147483647));
    //    System.out.format("%.5f",powerFunction(2,-2147483647));
    }
    public static double powerFunction(double x,int n){
        double start=1;
        if(n>0)
        for(int i=0;i<n;i++){
            start*=x;
        }
        else if(n==0){
            return 1;
        }
        else
            for(int i=0;i<Math.abs(n);i++){
               start/=x;
            }

        return start;
    }

    public static double pow(double x,int n){
        if(n==0){
            return 1;
        }
        if(n>0)
            return pow(x,n-1)*x;
        else
            return pow(x,n+1)/x;
    }
}
