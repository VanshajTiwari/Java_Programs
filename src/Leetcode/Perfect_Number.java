package Leetcode;

public class Perfect_Number {
    public static void main(String[] args) {
        int num=7;
        System.out.println(checkPerfectNumber(num));
    }
    public static boolean checkPerfectNumber(int num){
        int div=0;
        int sum=0;
        if(num==1){
            return true;
        }
        while(div++<=num){

            if(num%div==0){
                sum+=div;

            }
            if(div>num/2 && sum!=1 && num%sum==0){
                System.out.println(div+"+"+sum);
                return true;
            }

        }
        return false;
    }
}
