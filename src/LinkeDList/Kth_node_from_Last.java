package LinkeDList;

import java.util.concurrent.ExecutionException;

public class Kth_node_from_Last {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode KthNode(ListNode head,int k) throws Exception{
            ListNode slow=head;
            ListNode fast=head;
            for(int i=0;i<k;i++){
                if(fast.next==null)
                    throw new Exception("Kth Node not in Range");
                fast=fast.next;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;

            }
            return slow;
    }
}
