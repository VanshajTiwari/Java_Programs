package Assignment;
import java.util.*;
public class Rat_Chases_its_cheese {
    static boolean flag =false;
    public static void pathFinder(char[][]result, int chaseR, int chaseC, int[][]ans){
        if(chaseR==result.length-1 && chaseC==result[0].length-1 && result[chaseR][chaseC]!='X'){
            ans[chaseR][chaseC]=1;
            flag =true;
            showDis(ans);
            return;
        }
        if(chaseR<0  || chaseC<0  || chaseR>=result.length || chaseC>=result[0].length || result[chaseR][chaseC]=='X')
        {
            return;
        }
        result[chaseR][chaseC]='X';
        ans[chaseR][chaseC]=1;
        int[] r={-1,1,0,0};
        int[] c={0,0,1,-1};
        for(int i=0;i<c.length;i++){
            pathFinder(result, chaseR+r[i], chaseC+c[i],ans);
        }
        result[chaseR][chaseC]='O';
        ans[chaseR][chaseC]=0;
    }
    public static void showDis(int[][]ans){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int row=input.nextInt();
        int column=input.nextInt();
        char[][]theMaze=new char [row][column];
        for(int p=0;p<theMaze.length;p++){
            String str=input.next();
            for(int o=0;o<str.length();o++){
                theMaze[p][o]=str.charAt(o);
            }
        }
        int[][]result=new int[row][column];
        pathFinder(theMaze,0,0,result);
        if(!flag){
            System.out.println("NO PATH FOUND");
        }
    }
}