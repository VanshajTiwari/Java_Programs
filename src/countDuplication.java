import java.util.ArrayList;

public class countDuplication {
        public static void main(String[] args) {
            int[] Arr={1,1,2,3,3,4};
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i:Arr){
                arr.add(i);
                System.out.println(i+" : "+countdup(Arr,i));}
        }
        private static int countdup(int[] arr, int i) {

            int count=0;

            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    count++;
                }
            }
            return count;
        }



}
