
import java.util.*;
class Try {
    public static void main(String[] args) {
     for(int i=0;i<10;i++){

         for(int j=0;j<10;j++){
             System.out.println("j is working");
             if(j==5)
                 break;
         }
         System.out.println("i is working");
     }
    }
}