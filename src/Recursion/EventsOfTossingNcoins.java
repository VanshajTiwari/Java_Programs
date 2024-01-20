package Recursion;

public class EventsOfTossingNcoins {
    static int count=3;
    public static void main(String[] args) {
        String coin="HT";
        tossing("",3);
    }
    public static void tossing(String coin,int num){
            if(num==0){

                System.out.println(coin);
                return;
            }
        tossing(coin+'H',num-1);
        tossing(coin+'T',num-1);}

}
