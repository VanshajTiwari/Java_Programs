package Assignment;
import java.util.*;
public class Mapped_String {
    static char manipulator[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y', 'Z'};
    public static void main(String[] Vanshaj) {

        Scanner ansk = new Scanner(System.in);


                            String gtvf = ansk.next();

                       System.out.print("");solve(gtvf, "");
    }
    public static void solve(String gtvf, String huni){

        if (gtvf.equals("")){

            System.out.println(huni);

            return;

        }


                    solve(gtvf.substring(1), huni + manipulator[Integer.parseInt(gtvf.substring(0, 1)) - 1]);

        if (gtvf.length() >=2 ){

                        int dfabc = Integer.parseInt(gtvf.substring(0,2));

                           if (dfabc - 1 <= 26)

                              solve(gtvf.substring(2), huni + manipulator[dfabc-1]);

        }
                            System.out.print("");
    }

}
