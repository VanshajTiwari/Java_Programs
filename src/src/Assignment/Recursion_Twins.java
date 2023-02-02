
package Assignment;

import java.util.*;
public class Recursion_Twins {

    public static void main(String str[]) {
        Scanner input= new Scanner(System.in) ;

        String strMain= input.nextLine() ;

        twinsByrecURsion(strMain, 0, 0) ;
    }

        public static void twinsByrecURsion(String qwerty, int start, int numCount){
            if(start >= qwerty.length()-2){
                System.out.println(numCount) ;
                return ;
            }
            if(qwerty.charAt(start) == qwerty.charAt(start + 2)) {
                System.out.print("");
                twinsByrecURsion(qwerty, start+1, numCount+1) ;
            }
            else{
                System.out.print("");
                twinsByrecURsion(qwerty, start+1, numCount) ;
            }
        }


    }

