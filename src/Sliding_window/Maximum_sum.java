package Sliding_window;

public class Maximum_sum {
    public static void main(String[] args) {
        int[] a={1,2,3,4,1,4,7};
        int k=3;
        System.out.println(finder_Max(a,k));
    }
    public static int  finder_Max(int[] Arr,int len){
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=Arr[i];
        }
        int ans=sum;
        for(int i=len;i<Arr.length;i++){
            sum+=Arr[i];
            sum-=Arr[i-len];
            ans=Math.max(sum,ans);
        }
        return ans;
    }
}
