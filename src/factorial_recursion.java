public class factorial_recursion {
    public static void main(String[] args){
        int num=2;
        count(num);
        System.out.print(pow(num,10));
    }
    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        int fn=factorial(num-1);
        return num*factorial(num-1);
    }
    public static void count(int num){
    if(num==0){
        return;
    }
    count(num-1);


        }
        public static int tailfatorial(int num){
        int fact=1;
                if(num==0){
                    return 1;
                }
                else{
                    fact=num*tailfatorial(num-1);
                }
                return fact;
        }
        public static int pow(int nums,int b){
        if(b==1) {
            return nums;
        }
        return nums*pow(nums,b-1);
        }
        public static void fibonaccirec(int num){

        }
    }

