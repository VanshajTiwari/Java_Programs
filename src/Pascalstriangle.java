import java.lang.reflect.Array;
import java.util.*;
public class Pascalstriangle {
    public static double factorial(int num){
        double mul=1;
        if(num==0){
            return 1.000;
        }
        else
            for(int i=1;i<=num;i++){
                 mul*=i;
        }
        return mul;
    }
    public static ArrayList<Integer> pattern(int row){
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<=row;++i){

            list.add (((int) Math.ceil(factorial(row)/(factorial(row-i)*factorial(i)))));


        }
        return list;
    }
    public static void main(String[] args){
        int numrows=25;
        System.out.println(generate(numrows));
        }
        public static List<List<Integer>> generate(int numrows){

            List<List<Integer>> result=new ArrayList<>();
                for(int i=0;i<numrows;i++){
                    result.add(pattern(i));
                }
                return result;

        }
    }

