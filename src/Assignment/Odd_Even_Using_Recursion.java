package Assignment;
import java.util.*;
public class Odd_Even_Using_Recursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        //  oddEvenRec(num, 0, num);

        fun(num);
    }

    public static void fun(int num) {
        if(num==0) {
            return;
        }
        if (num % 2 == 1) {
            System.out.println(num);
        }
        fun(num-1);
        if (num % 2 == 0) {
            System.out.println(num);
        }

    }

    static void oddEvenRec(int num, int count, int flag) {
        if (flag == count)
            return;
        if (num % 2 == 0) {
            System.out.println(num);
            oddEvenRec(num + 2, ++count, flag);
        }
        else if(num==1){
            System.out.println(num);
            oddEvenRec(num+1,++count,flag);
        }
        else {
            System.out.println(num);
            oddEvenRec(num - 2, ++count, flag);
        }
    }
}
