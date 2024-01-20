package Recursion;
import java.util.*;
class Pallindrome_Partitioning {
    public static void main(String[] args) {
        String Ques="nitin";
        String ans="";
        partitioning(Ques,ans);
    }
    public static void partitioning(String Ques,String ans){
        if(Ques.isEmpty()){
            System.out.println(ans);
            return;}
        for(int i=1;i<=Ques.length();i++){
            String part=Ques.substring(0,1);
            partitioning(Ques.substring(i),ans+part+"|");
        }
    }
        public List<List<String>> partition(String s) {
            List<List<String>> l=new ArrayList<>();
            List<String> al=new ArrayList<>();
            partition3(s,"",l,al);
            return l;
        }
        public static void partition3(String que,String ans,List<List<String>> l,List<String> al){
            if(que.length()==0){
                l.add(new ArrayList<>(al));
                return;
            }
            for(int i=1;i<=que.length();i++){
                String Part=que.substring(0,i);
                if(isValidPalin(Part,0,Part.length()-1)){
                    al.add(Part);
                    partition3(que.substring(i),ans+Part,l,al);
                    al.remove(al.size()-1);
                }
            }
        }
        public static boolean isValidPalin(String s,int start,int end){
            while(start<=end){
                if(s.charAt(start++)!=s.charAt(end--)) return false;
            }
            return true;
        }
    }



