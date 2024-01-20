package Assignment;
import java.util.*;

public class All_Indices_Problem {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    int[] nums=new int[num];
    for(int i=0;i<num;i++){
        nums[i]=input.nextInt();
    }
    int target=input.nextInt();
    ArrayList<Integer> hello=allindexproblem(nums,target,0,new ArrayList<>());
    if(hello.size()==1){
        System.out.println(-1);
    }
    else
        for(int i=0;i<hello.size()-1;i++){
            System.out.print(hello.get(i)+" ");
        }
    }
    public static ArrayList<Integer> allindexproblem(int[] nums,int target,int index,ArrayList<Integer> ary){
        if(index==nums.length){
            ary.add(-1);
            return ary;
        }
        if(nums[index]==target){
            ary.add(index);
        }
        return  allindexproblem(nums,target,++index,ary);
    }
}
