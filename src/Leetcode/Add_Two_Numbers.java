package Leetcode;

import java.util.List;

public class Add_Two_Numbers {
      public static class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
            ListNode l1=new ListNode(2);
            ListNode l2=new ListNode(5);
            ListNode l1_head=l1;
            ListNode l2_head=l2;
            l1.next=new ListNode(4);
            l1=l1.next;
            l1.next=new ListNode(9);

            //
            l2.next=new ListNode(6);
            l2=l2.next;
            l2.next=new ListNode(4);
        l2=l2.next;
        l2.next=new ListNode(9);


            display(l1_head);
            display(l2_head);
            Addition(l1_head,l2_head);
    }
    public static void display(ListNode ll){
          while(ll!=null){
              System.out.print(ll.val+" -> ");
              ll=ll.next;
          }
        System.out.println("");
    }
    public static void Addition(ListNode l1,ListNode l2){
          ListNode newll=new ListNode(0);
          ListNode newll_head=newll;
          int val=0,carry=0;
          while(l1!=null && l2!=null){
                ListNode ll1;
              if(l1.val+l2.val>9){
                  val=(l1.val+l2.val)%10;
                  ll1=new ListNode( val+carry);
                  carry=1;
              }
              else {
                  val = l1.val + l2.val;
                  ll1 = new ListNode(val + carry);
                  carry = 0;
              }
               l1=l1.next;l2=l2.next;
               newll.next=ll1;
               newll=newll.next;
          }
          if(l1!=null)
          while(l1!=null || carry!=0 ){
              ListNode ll;
              if(l1!=null && (val+carry)>9){
                  System.out.println(val);
                  val= (l1.val+carry)%10;
                  ll=new ListNode(val);
                  carry=1;
              }
              else if(l1==null && val+carry>9){
                  val=0;
                  ll=new ListNode(val+carry);
                  carry=0;
              }
              else
                  ll=new ListNode(val+carry);


              newll.next=ll;
              newll=newll.next;

              if(l1!=null)
                l1=l1.next;

          }
        while(l2!=null || carry!=0 ){
            ListNode ll;
            if(l2!=null || (val+carry)>9){

                val= (l2.val+carry)%10;
                ll=new ListNode(val);
                carry=1;
            }
            else if(l2==null && val+carry>9){
                val=0;
                ll=new ListNode(val+carry);

                carry=0;
            }
            else
                ll=new ListNode(val+carry);


            newll.next=ll;
            newll=newll.next;

            if(l2!=null)
                l2=l2.next;

        }

        display(newll_head.next);

      }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {   //Correct


            ListNode  ll= new ListNode(0);
            ListNode ll_head = ll;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0) {
                int digit1 = (l1 != null) ? l1.val : 0;
                int digit2 = (l2 != null) ? l2.val : 0;

                int sum = digit1 + digit2 + carry;
                int digit = sum % 10;
                carry = sum / 10;

                ListNode newNode = new ListNode(digit);
                ll_head.next = newNode;
                ll_head = ll_head.next;

                l1 = (l1 != null) ? l1.next : null;
                l2 = (l2 != null) ? l2.next : null;
            }

            return ll.next;

        }
}

