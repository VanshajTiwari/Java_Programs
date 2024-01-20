import java.util.*;
public class firstP{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
     /*   //System.out.println(sc.nextLine().trim());
        String a="VanshajTiwari1234567890";
        String b="VanshajTiwari1234567890";
        if(a.equals(b)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("No");



        switch(2){
            case 1 ->System.out.println("I");
            case 2 ->System.out.println("M");
            case 3 -> System.out.println("Working");
            default ->System.out.println("Vanshaj");}


    System.out.println(sum());


        static String sum(){
        return "This Function Is Working";

      */
        int a=10,b=20;
        swap(a, b);
        System.out.println(a+" "+b);
        }
        static int swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        return a;
}
        }