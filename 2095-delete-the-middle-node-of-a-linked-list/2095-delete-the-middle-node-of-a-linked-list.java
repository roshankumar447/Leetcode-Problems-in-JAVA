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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        if(head.next==null) return null;
        while(true){
            fast=fast.next;
            if(fast==null) break;
            prev=slow;
            slow=slow.next;
            fast=fast.next;
            if(fast==null) break;
        }
        prev.next=slow.next;
        return head;
    }
}