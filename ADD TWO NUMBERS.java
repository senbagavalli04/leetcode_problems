/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        int carry=0;
        ListNode res = new ListNode(0);
        ListNode reshead=res;
        while(l1!=null || l2!=null){
            int x,y;
            x = (l1!=null) ? l1.val : 0;
            y = (l2!=null) ? l2.val : 0;
            sum=x+y+carry;
            carry = sum/10;
            reshead.next=new ListNode(sum%10);
            reshead = reshead.next ;
            l1=l1!=null ? l1.next : null;
            l2=l2!=null?l2.next: null;
        }
            if (carry>0)
            reshead.next=new ListNode(carry);
           return res.next;
    }
    }  
    
