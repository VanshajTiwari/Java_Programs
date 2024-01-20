import java.util.*;
public class BInarytodecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(),number=0,j=0;
        while(num>0){
            int bin=num%10;
            number+= bin*(int)Math.pow(2,j);
            j++;
            num/=10;
            
        }
        System.out.println(number);

    }
}
