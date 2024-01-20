package Recursion;
public class MatrixProblem01 {




    public static void main(String[] args) {
        System.out.println(pathFinder(1,1,4,4,""));


    }
    public static int pathFinder(int col, int row, int dc, int dr, String path) {
        if (col==dc && row==dr) {
            System.out.println(path+"("+col+","+row+")");
            return 1;
        }
        if (col>dc || row>dr) {
            return 0;
        }
        int vir=0;
        int hor=0;
        vir+=pathFinder(col+1,row,dc,dr,path+"("+col+","+row+")");
        hor+=pathFinder(col,row+1,dc,dr,path+"("+col+","+row+")");

        return vir+hor;

    }
}