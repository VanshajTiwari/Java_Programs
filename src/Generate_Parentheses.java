import java.util.*;


public class Generate_Parentheses {

    public static void main(String[] args) {

        generateParenthesis(10);

    }
    public static void generateParenthesis(int n) {
        ArrayList<String> arr=new ArrayList<>();
        System.out.println(parenthesis(n, "", 0, 0,arr)) ;
    }
    public static ArrayList<String> parenthesis(int n, String ans, int open, int close,ArrayList<String> arr) {

        if (open == n && close == n) {

            arr.add(ans);
        }
        if (open < n) {
            parenthesis(n, ans + "(", open + 1, close,arr);
        }
        if (open > close) {
            parenthesis(n, ans + ")", open, close + 1, arr);
        }
        return arr;
    }
}
