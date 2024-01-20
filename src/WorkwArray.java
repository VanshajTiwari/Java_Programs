import java.util.*;
public class WorkwArray{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
       arrray0();

    }
    public static void arrray0(){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }}
        public static void arrray() {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            int rum = input.nextInt();
            int[][] arr = new int[num][rum];
            int row = arr.length;
            int col = arr[0].length;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = input.nextInt();
                }

            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            }
            for (int i = 0; i < row; i++) {
                System.out.print(Arrays.toString(arr[i]));
                System.out.println();
            }
            for (int[] nume : arr) {
                System.out.println(Arrays.toString(nume));
            }
    }
            public static void arraylist () {
                ArrayList<Integer> array = new ArrayList<Integer>(10);
                array.add(5);
                array.add(6);
                array.set(1, 3);

                System.out.print(array.contains(5));
            }

}
