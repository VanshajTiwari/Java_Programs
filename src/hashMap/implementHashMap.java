package hashMap;

import java.util.ArrayList;

public class implementHashMap<K,V> {
    // HashMap Implementation
    //(THF)threshold that tells maximum factor
   class Node{
       K key;
       V val;
       Node next;


    }

    ArrayList<Node> ll;
    public implementHashMap(int n){
        ll=new ArrayList<>();
        for(int i=0;i<n;i++){
            ll.add(null);
        }
    }
    public implementHashMap(){
        this(4);
    }
    private int size=0;
    public int hashfun(K key){
        int bn=key.hashCode() % ll.size();
        if(bn<0)
            bn=bn+ll.size();
        return bn;
    }
    public V get(K key){
        int idx=hashfun(key);
        Node temp=ll.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                return temp.val;}
            temp=temp.next;
        }
        return null;

    }
    public void put(K key,V value){
        int idx=hashfun(key);
        Node temp=ll.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                temp.val=value;
                return;
            }
            temp=temp.next;
        };
        Node nn=new Node();
        nn.key=key;
        nn.val=value;
        temp=ll.get(idx);
        nn.next=temp;
        ll.set(idx,nn);
        size++;
        double thf=2.0;
        double lf=(1.0*size)/ll.size();
        if(lf>thf){

        }
    }
    private void rehashing(){
        ArrayList<Node> new_List=new ArrayList<>();
        for(int i=0;i<2*ll.size();i++){
            new_List.add(null);
        }
        ArrayList<Node> oba=ll;
        ll=new_List;
        for(Node temp:oba){
            while(temp!=null){
                put(temp.key,temp.val);
                temp=temp.next;
            }
        }
    }
    public boolean containsKey(K key){
        int idx=hashfun(key);
        Node temp=ll.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public V remove(K key){
        int  idx =hashfun(key);
        Node curr=ll.get(idx);
        Node prev=null;
        while(curr!=null){
            if(curr.key.equals(key)){
                break;
            }
            prev=curr;
            curr=curr.next;}
        if(curr==null){
            return null;
        }
        else if(prev==null){
            ll.set(idx,curr.next);
            curr.next=null;
            size--;
            return curr.val;
        }
      return null;
    }

}
