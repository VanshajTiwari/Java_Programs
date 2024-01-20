package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(1234));
    }
    public static int addDigits(int num){
        if(num<=1){
            return 1;
        }
        return num%10+addDigits(num/10);
    }
}
