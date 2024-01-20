package Assignment;
import java.util.*;
public class Split_array {
    public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
            int num =scn.nextInt();
            int[] arr= new int[num];
            for(int i = 0; i< num; i++) {
                arr[i]=scn.nextInt();
            }
            plitter(arr, 0, 0, "", 0, "");
            System.out.println(plitter2(arr, 0, 0, "", 0, ""));

        }
        public static void plitter(int[] arr, int vidx, int sumL, String ansL, int sumR, String ansR ) {
            if(vidx==arr.length) {
                if(sumL==sumR) {
                    System.out.println(ansL+ " and "+ ansR);
                }
                return;
            }

            plitter(arr, vidx+1, sumL+ arr[vidx], ansL+ arr[vidx]+ " ", sumR, ansR);
            plitter(arr, vidx+1, sumL, ansL, sumR+ arr[vidx], ansR+arr[vidx]+ " ");
        }
        public static int plitter2(int[] arr, int vido, int summo, String result, int resultSum, String resultAns ) {
            int nummer=0;
            if(vido==arr.length) {
                if(summo==resultSum) {
                    return 1;
                }
                return 0;
            }

            nummer+= plitter2(arr, vido+1, summo+ arr[vido], result+ arr[vido]+ " ", resultSum, resultAns);
            nummer+= plitter2(arr, vido+1, summo, result, resultSum+ arr[vido], resultAns+arr[vido]+ " ");
            return nummer;
        }
    }

