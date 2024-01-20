package RevRec;

public class Key_Pad_Pro {
    static String[] Arr={"","abc","def","ghi","jkl","mno","pqr","stv","vwx","yz"};
    public static void main(String[] args) {
        keypad("12","");
    }
    public static void keypad(String num,String ans){
        if(num.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=num.charAt(0);
        String processStr=Arr[ch-48];
        for(int i=0;i<processStr.length();i++){
             keypad(num.substring(1),ans+processStr.charAt(i));
        }
    }
}
