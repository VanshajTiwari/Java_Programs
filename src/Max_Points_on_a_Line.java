import java.util.*;
import java.lang.Float;
public class Max_Points_on_a_Line {
    public static void main(String[] args){
        int[][] arr={{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        int[] slope=new int[10];

        ArrayList<Float> slope1=slope(arr);
        System.out.println(slope1);
        System.out.println(sameSlope(slope1));
    }
    public static ArrayList<Float> slope(int[][] arr){
        ArrayList<Float> uji=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][0]-arr[j][0]!=0){
                if(i!=j){
                    float result= (arr[j][1]-arr[i][1])/(arr[j][0]-arr[i][0]);
                    uji.add(result);}
            }
                else{
                    if(i!=j){
                        float result= (arr[i][1]-arr[j][1])/(Integer.MAX_VALUE);
                        uji.add(result);}
                }
            }

        }

        return uji;
    }
    public static int sameSlope(ArrayList<Float> nums){
        int count=0,max=0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.size();j++){
                if(Float.compare(nums.get(i), nums.get(j)) == 0) {
                    count++;
                }
            }
            if(count>max){
                max=count;
            }
            count=0;
        }
        return max;
    }
}
