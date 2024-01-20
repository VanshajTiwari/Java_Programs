package RevRec;

public class Matrix_pro {
    public static void main(String[] args) {
                traverse(0,0,5,5,"");
    }
    public static int traverse(int ini_X,int ini_Y,int fin_X,int _Y,String ans) {
        if(ini_X==fin_X && ini_Y==_Y){
            System.out.println(ans+"(5,5)");
            return 1;
        }
        if(ini_X>fin_X || ini_Y>_Y){
            return 0;
        }
       int f1= traverse(ini_X+1,ini_Y,fin_X,_Y,ans+"("+ini_X+","+ini_Y+") " );
        int f2=traverse(ini_X,ini_Y+1,fin_X,_Y,ans+"("+ini_X+","+ini_Y+") " );
        return f1+f2;
    }
}
