package Recursion;

 class numbyrec {
    public static void main(String[] args){
        printNum(1);
    }
    static void printkaro(int n){
        if(n==5)
            return;
        System.out.println(n);
        printkaro(n+1);
    }
    static void printNum(int n){
        if(n==5){
            return;
        }
        printNum(n+1);
        System.out.println(n);
    }
}
