package Recursion;

public class Tower_of_hanoi {
    static int count=0;
    public static void main(String[] args) {
        Count(3,"A","B","C");
        System.out.println(count);
    }
    public static  void Count(int n,String S,String H,String D){
        if(n==0){
            return;
        }
       Count(n-1,S,D,H);
        Tower_of_hanoi.count++;
        System.out.println("disk"+n+"MOved from"+S+" To "+D);
      Count(n-1,H,S,D);
      // return c1+c2;
    }
}
