import java.util.*;
public class Conversion_anytoany {
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
   int num=input.nextInt();
    int base=input.nextInt();   //range  [1,10)
    int tobase=input.nextInt(); //range   [1,..)
    num=todecimal(2,101);
    if(num==10){
        System.out.print(num);
    }
    else{
        System.out.print(decimaltoany(tobase,num));
    }
}
public static int todecimal(int initial,int number){
    int bin=0,j=0,result=0;
    while(number>0){
        bin=number%10;
        number/=10;
        result+=bin*(int)Math.pow(initial,j);
        j++;

  }return result;
}
public static String decimaltoany(int final0,int number){
    String result="";
    while(number>0){
        String c=Integer.toString(number%final0);
        result=c+result;
        number/=final0;
    }
    return result;
}
}


