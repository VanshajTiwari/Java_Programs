package LinkeDList;
import java.util.*;
public class customLL<T>{
    class Node{
        T data;
        Node next;
        public Node(T data){
            this.data=data;
        }
    }
    public Node head;
    public Node tail;
    public int size;

    public void size(){
        System.out.println(this.size);
    }
    public void addFirst(T item){
        Node nn=new Node(item);
        if(size==0){
            this.head=nn;
            this.tail=nn;
        }
        else{
            nn.next=this.head;
            head=nn;

        }
        size++;

    }
    public void addlast(T item){
        Node nn=new Node(item);
        if(size==0){
            this.head=nn;
            this.tail=nn;
        }
        else{
        this.tail.next=nn;
        this.tail=nn;
        size++;}
    }
    public void addAtAny(int index,T item) throws Exception{
        if(index==0 ) {
            addFirst(item);
        }
        else if(index==size){
            addlast(item);
        }
        else if(index<size-2 && index>0){
            Node nn=new Node(item);
        Node prefix=getNode(index-1),mid=getNode(index);
        prefix.next=nn;
        prefix=nn;
        prefix.next=mid;
        size++;}
    }
    public void getFirst() throws Exception{
        if(size==0)
                throw new Exception("LIst is EMpty");

        System.out.println(this.head.data);
    }
    public void getLast() throws Exception{
                if(size==0)
                        throw new Exception("LIst is EMpty");

        System.out.println(this.tail.data);
    }
    public void getindex(int k) throws Exception{
        System.out.println(this.getNode(k).data);
    }
    public Node getNode(int k) throws Exception{
        if(k<0 || k>size){
            throw new Exception("Out of Range ");
        }
        Node temp=this.head;
        for(int i=0;i<this.size;i++){
            if(i==k){
            //    System.out.println("Node"+temp.data);
                return temp;
            }
            temp=temp.next;
        }
        return temp;
    }
    public void removeFirst() throws Exception{
        if(size==0){
            throw new Exception("List is Already Empty");
        }
        System.out.println("Removed NOde with data :"+head.data);
        Node temp=head;
        temp=temp.next;
        head.next=null;
        head=temp;
        size--;
    }
    public void removeLast() throws Exception{
        if(size==0){
            throw new Exception("List is Already Empty");
        }
        System.out.println("Removed NOde with data :"+tail.data);

        Node temp=getNode(size-2);
       temp.next=null;
       this.tail=temp;
       this.size--;

    }
    public void removedAtAny(int index) throws Exception{
        if(size==0 ) {
            throw new Exception("List is Already Empty");
        }
        else if(index==0){
            removeFirst();
            return;
        }
        else if(index==size-1){
            removeLast();
            return;}
      //  Node temp=this.head;
        Node prefix = null,suffix=null,mid=null;
        prefix=getNode(index-1);
        mid=getNode(index);
        suffix=getNode(index+1);
        prefix.next=suffix;
        mid.next=null;
        size--;
    }
    public void display(){
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("");
    }




    public static void main(String[] args) throws Exception{
        customLL<String> names=new customLL();
//        names.addFirst(12);
//        names.addFirst(10);
//        names.addFirst(9);
//        names.addlast(14);
//        names.addFirst(8);
//        names.addlast(19);
//        names.size();
//        names.getFirst();
//        names.getLast();
//        names.removeFirst();
//        names.removeLast();
//     //   names.removedAtAny(2);
//        names.size();
//        names.display();
//        System.out.println("\n");
//        names.removedAtAny(2);
//        System.out.println("\n");
//        names.size();
//        System.out.println("\n");
//        names.display();
//        System.out.println("\n");
//        names.addAtAny(3,12);
//        names.size();
        names.addFirst("Vanshaj");
        names.addFirst("Srajan");
        names.display();
       // names.getindex(3);

    }
}
