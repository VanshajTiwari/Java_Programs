package Assignment;

import java.util.Scanner;

public class Replace_all_pi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int trial=input.nextInt();
        for(int i=0;i<trial;i++){
            String num=input.next();
            System.out.println(replace2pi(num));}
    }
    public static String replace2pi(String main){
        if(main.isEmpty()){
                return "";}
    if(main.startsWith("pi"))
        return ""+replace2pi("3.14"+main.substring(2));

    return main.charAt(0)+replace2pi(main.substring(1));
}
}
