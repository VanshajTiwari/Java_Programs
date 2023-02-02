package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Generate_Binary_Strings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int trial=input.nextInt();
        ArrayList<String> mainBow = new ArrayList<>();
        for(int i=0;i<trial;i++) {
            generateBin(input.next(), "", mainBow);
            for(String j:mainBow)
                System.out.print(j+" ");
            System.out.println();
        }
    }
    public static void generateBin(String a,String b,ArrayList<String> mainBow){
        if(a.isEmpty())
        {
            mainBow.add(b);
            return;
        }
        if(a.startsWith("?")){

               generateBin(a.substring(1),b+"0",mainBow);
               generateBin(a.substring(1),b+"1",mainBow);

        }
        else
             generateBin(a.substring(1),b+a.charAt(0),mainBow);
    }
}

