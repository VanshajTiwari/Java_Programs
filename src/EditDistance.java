import java.util.*;
public class EditDistance {
    public static void main(String[] args){
        String a="intention",b="execution";
       System.out.println( minDistance(a,b));
    }
    public static int minDistance(String word1,String word2){
        ArrayList<String> array0=new ArrayList<>();
        ArrayList<String> array1=new ArrayList<>();
        for(int i=0;i<word1.length();i++) array0.add(Character.toString(word1.charAt(i)));

        for(int i=0;i<word2.length();i++) array1.add(Character.toString(word2.charAt(i)));
        int len0=array0.size(),len1=array1.size(),count=1;
           return operation(array1,array0,len1,len0);
        }

    public static int operation(ArrayList<String> array00,ArrayList<String> array01,int len00,int len01 ){
        int count=0,bound=0;
        for(int i=0;i<len00;i++){
                System.out.println(array01);
              if(!array00.get(i).equals(array01.get(i))) {
                  if (array01.size() - 1 >= i + 1 && array00.get(i).equals(array01.get(i + 1))) {
                      String a = array01.get(i);
                      array01.add(array01.get(i));
                      array01.remove(i);


                      count++;
                  } else {
                      if (array00.size() - 1 > i + 1 && array00.get(i + 1).equals(array01.get(i))) {
                          array01.add(i, array00.get(i));
                      } else {
                          array01.set(i, array00.get(i));
                      }
                      count++;
                  }
              }
            }
        len00=len01-len00;
        for(int i=array00.size();i<array01.size();i++){

            array01.remove(i);count++;}

            return count;

    }

    }
