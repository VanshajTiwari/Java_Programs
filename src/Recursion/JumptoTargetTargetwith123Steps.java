package Recursion;

class JumptoTargetwith123Steps {
    public static void main(String[] args) {
        System.out.println(stepOn(4,0,""));
    }
    public static int stepOn(int target,int curr,String Steps){
        if(curr==target){
            System.out.println(Steps);
            return 1;
        }
        else if(curr>target){
            return 0;
        }
        int f1=0;
        for(int i=1;i<=3;i++){
                f1+=stepOn(target,curr+i,Steps+i);}

        return f1;
    }
}
