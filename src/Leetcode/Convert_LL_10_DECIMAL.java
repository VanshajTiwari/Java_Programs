package Leetcode;

import LinkeDList.reverseLL;

import java.util.List;

public class Convert_LL_10_DECIMAL {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode ll=new ListNode(1);
        ListNode head=ll;
        ll.next=new ListNode(0,new ListNode(1));
        ListNode hew=reverse(head);
        int po=0;
        int sum=0;
        while(hew!=null){
            sum+=hew.val*Math.pow(2,po);
            hew=hew.next;
            ++po;
        }
        System.out.println(sum);
    }
    public static ListNode reverse(ListNode head){
          ListNode curr=head;
          ListNode next=null;
          while(curr!=null){
              ListNode pre=new ListNode(curr.val);
              //  pre.val=curr.val;
              pre.next=next;
              next=pre;
              curr=curr.next;
          }
          return next;
      }
}