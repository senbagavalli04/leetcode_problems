/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)  {
    if (headA == null || headB == null) return null;
     int h1 = size(headA);
     int h2 = size(headB);
     ListNode t1 = headA;
     ListNode t2 = headB;

     //System.out.println(h2 - h1);
     if(h1 > h2){
        while(h1>h2){
            h1--;
            t1 = t1.next;   
        }
     }
      if(h2 > h1){
        while(h2>h1){
            h2--;
            t2 = t2.next;   
        }
     }
     while(t1!=t2){
        t1 = t1.next;
        t2=t2.next;
        if(t1==t2) return t1;
     }

    return null;
    }
   
    public int size (ListNode head){
        int c = 0 ;
        ListNode temp = head;
        while(temp!=null){
            c+=1;
            temp= temp.next;
        }
         return c;
    }
   
}
