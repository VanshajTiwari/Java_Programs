import java.util.*;
public class Valid_Anagram {
    public static void main(String[] args){
        Valid_Anagram ba=new Valid_Anagram();
        String a="car",b="rat";
   //     System.out.println(ba.isAnagram(a,b));
       System.out.println(checker(a,b));


    }
    public boolean isAnagram(String s, String t) {
        boolean valid=false;
        boolean[] visited=new boolean[t.length()];
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){

                valid=false;
                for(int j=0;i<s.length();++j){
                    if(t.charAt(j)==s.charAt(i) && !(visited[j])){
                        visited[j]=true;
                        valid=true;
                        break;
                    }
                }
                if(!valid)
                    break;
            }
            if(valid){
                return true;
            }


        }
        return false;
    }
    public static boolean checker(String s,String t){
        int[] arr=new int[256];
        boolean valid=true;
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){
               int a=s.charAt(i);

               arr[a]++;

                }
            System.out.println(Arrays.toString(arr));
            for(int i=0;i<s.length();i++){
                int a=t.charAt(i);
                arr[a]--;

            }
            System.out.println(Arrays.toString(arr));
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0) {
                    valid=false;
                    break;}
            }


        }
        else{

            return false;
        }

        if(valid){
            System.out.println(Arrays.toString(arr));
            return true;}
    return false;
    }
}
