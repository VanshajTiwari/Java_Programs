package RevRec;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(series(7));
    }
    public static int series(int num){
        if(num==1 || num==0){
            return num;
        }

        int rs= series(num-1)+series(num-2);
        return rs;
    }
}

