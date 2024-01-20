package Leetcode;

import LinkeDList.reverseLL;

import java.util.*;


class Remove_Duplicates_from_Sorted_List {
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
        ll.next=new ListNode(1);
        ll=ll.next;
        ll.next=new ListNode(2);
        ListNode newHead=deleteDuplicates(head);
        while(newHead!=null){
            System.out.println(newHead.val);
            newHead=newHead.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
            if(head==null || head.next==null)
                return head;
            ListNode curr=head;
           while(curr!=null || curr.next!=null){
                    if(curr.val==curr.next.val){
                        curr.next=curr.next.next;
                    }
                    else{
                        curr=curr.next;
                    }

           }
           return head;

    }
}