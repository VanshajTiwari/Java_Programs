package Recursion;

import java.util.ArrayList;

public class lexicographical_Order {
    public static void main(String[] args) {
        int[] num={2,3,4,1,10,4,6};
        ArrayList<Integer> num1=new ArrayList<>();
        for(int i=1;i<9;i++){
            lexicoArr(i,20,num,num1);
        }
    System.out.println(num1);
    }
        public static void lexico(int i,int n){
            if(i>n){
                return;
            }
            System.out.println(i);
            for(int j=0;j<10;j++){
                lexico(i*10+j,n);
            }

        }
    public static void lexicoArr(int i, int n, int[] num, ArrayList<Integer> num1){
        if(i>n){
            return;
        }
        for(int k=0;k<num.length;k++){
            if(num[k]==i){
                num1.add(i);
            }
        }
        for(int j=0;j<10;j++){
            lexicoArr(i*10+j,n,num,num1);
        }

    }
    }

