package Assignment;
import java.util.*;
public class Boardpath {


        static int numCon = 0 ;

        public static void boardRecurionPath(int get, int listOfArr[], String hyui){
            if(get==0){
                System.out.print(hyui + " ") ;
                numCon++ ;
                return ;
            }

            for(int ui=0; ui<listOfArr.length; ui++){
                if(get >= 0){
                    boardRecurionPath(get-listOfArr[ui] , listOfArr, hyui+ listOfArr[ui]) ;
                }
            }
        }

        public static void main(String CodingBlocks[]) {
            // Your Code Here
            Scanner input= new Scanner(System.in) ;
            int in1=input.nextInt() ;
            int di1=input.nextInt() ;
            int list[]= new int[di1] ;
            for(int i=0; i<di1; i++){
                list[i]=i+1 ;
            }
            boardRecurionPath(in1, list, "") ;
            System.out.println() ;
            System.out.print(numCon) ;
            input.close() ;
        }
}

