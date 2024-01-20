package hashMap;
import java.util.*;
public class hash1 {
    public static void main(String[] args) {
        TreeMap<String,Integer> map=new TreeMap<>();
        //Insertion
        map.put("Raj",120);
        map.put("Manisha",30);
        map.put("Amisha",150);
        map.put("puneet",9);
        map.put("Atul",19);
        map.put("Pooja",39);
        //Search

        System.out.println(map); //random show to maintain O(1) complexity
        LinkedHashMap<String,Integer> map2=new LinkedHashMap<>();  //DOUBLY LINKED LIST USED TO IMPLEMENT
        map2.put("Raj",120);
        map2.put("Manisha",30);
        map2.put("Amisha",150);
        map2.put("puneet",9);
        map2.put("Atul",19);
        map2.put("Pooja",39);
        map2.put(null,39);
        System.out.println(map2);
//        if(map.containsKey("CHina")){
//            System.out.println("yes");
//        }
//        System.out.println(map);
//
//        //Getting value using key
//        System.out.println(map.get("CHina"));
//
//        //Iterating in HashMap
//        for(Map.Entry<String,Integer> e:map.entrySet()){
//            System.out.print(e.getKey()+":");
//            System.out.println(e.getValue());
//        }

//        Set<String> keys=map.keySet();
//        for(String key:keys){
//            System.out.println(key+" "+map.get(key));
//        }
    }
}
