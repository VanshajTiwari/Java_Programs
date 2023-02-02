import java.util.Scanner;
import java.util.*;

public class Try {
    public static void main(String[] args) {
        int k=2;
        int n=4;
        System.out.println(combine(n,k));
    }
    public static List<List<Integer>> combine(int n, int k) {
        return combine1(n,k,new ArrayList<>(),new ArrayList<>());
    }
    public static List<List<Integer>> combine1(int n,int k,List<Integer> result,List<List<Integer>> mainResult){
        if(n==k){
            return mainResult;
        }
        for(int i=0;i<2;i++){

        }

    }
}