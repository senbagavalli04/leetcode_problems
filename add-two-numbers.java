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
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode last = null;
        ListNode ansHead = l1;
        int sum;
        int carry =0;
        while(l1!=null || l2!=null){
            sum = carry;
            if(l1!=null){
               sum+=l1.val;
            }
            if(l2!=null){
               sum+=l2.val;
            }
            if(l1!=null){
               l1.val = sum%10;
               last = l1;
               ansHead = t1;
               l1 = l1.next;
            }
            if(l2!=null){
               l2.val = sum%10;
               last = l2;
               ansHead = t2;
               l2 = l2.next;
            }
            carry=sum/10;
    }
    if(carry != 0){
        ListNode newMem = new ListNode(carry);
        last.next = newMem;
    }
    return reverse(ansHead);
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode;
        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;

    }
}
