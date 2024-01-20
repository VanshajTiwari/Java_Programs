public class Max_Sum_Of_Window_size_k {


    public static void main(String[] args) {
        int [] arr={1,2,5,7,11,3,4};
        System.out.println(findMaxsum(arr,3));

    }


    private static int findMaxsum(int[] arr, int i) {
        int sum=0;
        for(int j=0;j<i;j++){
            sum+=arr[j];
        }
        int ans=sum;
        for(int j=i;j<arr.length;j++){
            sum+=arr[j];
            sum-=arr[j-i];
            ans=Math.max(ans,sum);
        }
        return ans;
    }

}

