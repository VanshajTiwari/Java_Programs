public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
        int[] Arr={1,2,3,2,3};
        System.out.println(
                findkProduct(Arr,3));
    }

    private static int findkProduct(int[] arr, int k) {
        int si=0;
        int li=0;
        int pro=1;
        int ans=0;
        while(li<arr.length){
                pro*=arr[li];
                while(pro>k){
                    pro/=arr[si];
                    si++;
                }
                if(pro<k){
                    ans++;
                }
                li++;
        }
        return ans;
    }

}
