import java.util.*;
public class Dictionary_Order_Larger {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        List<String>ll=new ArrayList<>();
        lexico(str,"",str,ll);
        Collections.sort(ll);
        for(int i=0;i<ll.size();i++)
            System.out.println(ll.get(i));
    }
    public static void lexico(String a ,String b,String c,List<String>ll){
        if(a.length()==0 && c.compareTo(b)<0){
            ll.add(b);
            return;
        }
        for(int i=0;i<a.length();i++){
            String s1=a.substring(0,i);
            String s2=a.substring(i+1);
            char ch=a.charAt(i);
            lexico(s1+s2,b+ch,c,ll);
        }
    }
}