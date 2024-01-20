package Assignment;
import java.util.*;
public class Maze_Path {


        static int numCOunt =0 ;

        public static void mazeFun_Path1(int num1, int num2, int pr, int qr, String result){
            if(pr==num1 && qr==num2){
                System.out.print(result + " ") ;
                numCOunt++ ;
                return ;
            }
            if(pr<num1){
                mazeFun_Path1(num1, num2, pr+1, qr, result+"V") ;
            }
            if(qr<num2){
                mazeFun_Path1(num1, num2, pr, qr+1, result+"H") ;
            }
        }
        public static void fun(){
            System.out.println();
        }

        public static void main(String args[]) {
            // Your Code Here
            Scanner input= new Scanner(System.in) ;
            int num1=input.nextInt() ;
            int num2=input.nextInt() ;

            mazeFun_Path1(num1-1, num2-1, 0, 0, "") ;
               fun();
            System.out.print(numCOunt) ;
        }

}
