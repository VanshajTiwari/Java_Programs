package Recursion;

public class KeypadProblem {
    static String[] Arr={"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void main(String[] args) {
        keypad("12","");
    }
    public static void keypad(String a,String ans){
        if(a.isEmpty()){
            System.out.println(ans);
                return;
        }

        char ch=a.charAt(0);
        String preString =Arr[ch-48];
        for(int i=0;i<preString.length();i++)
            keypad(a.substring(1),ans+preString.charAt(i));
        }
    }


