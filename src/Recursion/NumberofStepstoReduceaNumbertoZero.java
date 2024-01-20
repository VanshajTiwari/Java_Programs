package Recursion;

public class NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
    public static int numberOfSteps(int num) {
        return stepStp(num,0);
    }
    static int stepStp(int num,int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            count++;
           return stepStp(num/2,count);
        }
        else
            count++;
      return  stepStp(num-1,count);

    }
}
