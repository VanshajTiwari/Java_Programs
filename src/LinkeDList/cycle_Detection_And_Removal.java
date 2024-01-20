package LinkeDList;

public class cycle_Detection_And_Removal extends customLL{
    public static void main(String[] args) throws Exception {
        customLL ab=new customLL();
        ab.addFirst(1);
        ab.addFirst(2);
        ab.addFirst(3);
        ab.addFirst(4);
        ab.addFirst(5);
        ab.addFirst(6);
        //System.out.println(ab.head.data);
        //ab.size();
        //ab.display();
        ab.getNode(ab.size-1).next= ab.getNode(3);
        //System.out.println(ab.getNode(ab.size-1).next);
        //ab.display();
      //  detect(ab.head);
        removal(ab.head);
        ab.display();
    }
    public static Node detect(Node head){
        customLL.Node slow=head,fast=head;



        while(fast!=null && fast.next!=null) {
                fast=fast.next.next;
                slow=slow.next;
                if(slow.next==fast.next){
                    return slow;
                }
        }
        return null;

    }
    public static void removal(Node head){
        Node meet=detect(head);
        Node slow=head;
        while(slow.next!=meet.next){
            slow=slow.next;
            meet=meet.next;
        }
        meet.next=null;
    }
}
