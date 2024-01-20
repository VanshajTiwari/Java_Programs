package Recursion;

import java.util.ArrayList;

public class lexicographical_Order {
    public static void main(String[] args) {
        int[] num={2,3,4,1,10,4,6};
        ArrayList<Integer> num1=new ArrayList<>();
        //lexico(0,1000);
        for(int i=1;i<9;i++){
            lexicoArr(i,20,num,num1);
        }
    System.out.println(num1);
    }
        public static void lexico(int i,int n){
            if(i>n){
                return;
            }
            int j=0;
            if(i==0){j=1;}
            System.out.println(i);
            for(;j<=2;j++){
                lexico(i*10+j,n);
            }

        }
    public static void lexicoArr(int curr, int len, int[] num, ArrayList<Integer> num1){
        if(len>curr){
            return;
        }
        for(int i=0;i<num.length;i++){
            if(num[i]==len){
                num1.add(len);
            }
        }
        int j=0;
        if(curr==0){
            j=1;
        }
        for(;j<num.length;j++){
            lexicoArr(curr*j+len,len,num,num1);
        }
        }
    }

