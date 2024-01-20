package LinkeDList;
import java.util.Scanner;
public class RemoveKth {


    class Node{
            int val;
            Node next;
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
        public void display(Node head){
            while(head!=null){
                System.out.print(head.val+" ");
                head=head.next;
            }
        }

        public Node getNode(int k){
            Node temp=head;
            int i=0;
            while(i!=k){
                temp=temp.next;
                ++i;
            }
            return temp;
        }
        public void removeKthnode(int k){
            // Write Code Here
            if(k==1){
                Node mid=this.getNode(this.size-1);
                mid.next=null;
            }
            else if(k==size){

                this.head=head.next;
            }
            else if(k>1 && k<this.size){
                Node pre=this.getNode(this.size-k-1);

                Node mid=this.getNode(this.size-k);
                Node post=this.getNode(this.size-k+1);
                pre.next=post;
                mid.next=null;}
            size--;
        }

        public static void main (String args[]) {
            Scanner inp=new Scanner(System.in);
            RemoveKth x= new RemoveKth();
            int size=inp.nextInt();
            int k=inp.nextInt();

            for(int i=0;i<size;i++){
                x.addLast(inp.nextInt());
            }
            x.removeKthnode(k);
            x.display();
            //  x.display();
        }

    }

