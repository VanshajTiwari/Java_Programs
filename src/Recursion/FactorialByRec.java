package Recursion;

public class FactorialByRec {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
    public static void counter(int num,int a){
        if(num==a){
           System.out.println( factorial(num));
           return ;
        }
        System.out.println(factorial(a));
            counter(num,a+1);

    }
    public static int factorial(int num) {
        if(num<=1){
            return 1;
        }
        else if(num-1<0){
            return -1;
        }
        return num*factorial(num-1);
    }
    public static void rangeFactorial(int num,int a,int result){
      if(num==a){
          return ;
      } else if (num<0) {
            System.out.println("Invalid Input");
            return;
      }
        result*=num;
      System.out.println(result);
        rangeFactorial(num+1,a,result);

    }
}
