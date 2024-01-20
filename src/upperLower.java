import java.util.*;
public class upperLower {
    public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                char a=sc.nextLine().charAt(0);
                if(a>=65 && a<=90){
                    System.out.println("UPPERCASE");
                }
                else if(a>=97 && a<=122){
                    System.out.println("lowercase");
                }
                else{
                    System.out.println("Invalid");
                }
            }

}
