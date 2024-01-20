import java.util.Arrays;

public class prime_sieve_Algo {
    public static void main(String[] args) {
        chwecker(3);
        primesieve(10);
    }
    public static void chwecker(int nn){
        if(nn==2){
            System.out.println("prime");
            return;
        }
        else if(nn<2){
            System.out.println("Not prime");
            return;
        }
        else if(nn>2){
        for(int i=2;i*i<=nn;i++ ){
            if(nn%i==0){
                System.out.println("Not Prime");
                return;
            }}

            System.out.println("Prime");
        }
    }
    public static void primesieve(int n){
        boolean[] Arr=new boolean[n+1];
        Arr[0]=true;
        Arr[1]=true;
        for(int i=2;i*i<=n;i++){
            if(Arr[i]==false){
                for(int j=2;j*i<=n;j++) {
                  Arr[i * j] = true;
              }
            }
        }
        System.out.println(Arrays.toString(Arr));
    }
}
