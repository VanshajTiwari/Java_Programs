package LinkeDList;

import java.util.Scanner;

public class reverseLL {
    class Node{
        int val;
        Node next;
        public Node(){}
        public Node(int val){
            this.val=val;
        }}
    private Node head;
    private int size=0;
    private Node tail;

    public void addLast(int item){
        Node nn=new Node(item);
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            tail.next=nn;
            tail=nn;
            size++;}

    }
    public void display(){
        for(int i=0;i<this.size;i++){
            System.out.print(this.head.val+" ");
            this.head=this.head.next;
        }
    }
    public void reverse(){
        //Write Your Code Here
        Node curr=this.head,next=new Node();//pre=next;
       // Node header=next;

        while(curr!=null){
            Node pre=new Node(curr.val);
          //  pre.val=curr.val;
            pre.next=next;
            next=pre;
            curr=curr.next;
        }
        while(next.next!=null){
            System.out.print(next.val+"->");
            next=next.next;
        }
//        while(header!=null){
//            System.out.print(header.val+" ");
//            header=header.next;
//        }
        //return header.next;
    }
    public void display(Node head){
        while(head!=null){
            System.out.println(head.val+" ");
            head=head.next;
        }
    }

    public static void main (String args[]) {
        Scanner inp=new Scanner(System.in);
        reverseLL x=new reverseLL();
        int size=inp.nextInt();
        for(int i=0;i<size;i++){
            x.addLast(inp.nextInt());
        }
        x.reverse();
       // x.display(x.reverse();
    }
}
