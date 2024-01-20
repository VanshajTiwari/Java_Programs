package Recursion;

public class RevereNumber {
    public static void main(String[] args) {
        System.out.println(revNum(123,0));
    }

    static int revNum(int num,int rev) {
        if (num <= 0)
            return rev;
        rev=rev*10+num%10;
        return revNum(num/10,rev);

    }
}
