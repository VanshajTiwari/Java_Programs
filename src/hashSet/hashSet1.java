package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
        System.out.println(set.contains(1));
        System.out.println(set.contains(4));
        set.remove(1);
        System.out.println(set.size());
        System.out.println(set);
        int[] a={1,2,3,4,1,1,1,5,7,8,8,9,11,10};
        HashSet<Integer> result=new HashSet<>();
        for(int i:a){
            result.add(i);
        }
        System.out.println(result);


        //Iterator
        Iterator it=set.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());
    }
}
