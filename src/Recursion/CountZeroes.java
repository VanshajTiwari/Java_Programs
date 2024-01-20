package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(findZeroes(1123,0));
    }
    static int findZeroes(int num,int count){
        if(num<=0){
            return count;
        }
        if(num%10==0)
            count++;
        return findZeroes(num/10,count);
    }
}
