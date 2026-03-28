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
       // slow and fast pointer
       ListNode slow = head;
       ListNode fast = head;
       ListNode prevSlow = null;

       if(head.next == null || head == null) return null;

       while( fast != null && fast.next != null){
            prevSlow = slow;       // track previous
            slow = slow.next;      // move 1
            fast = fast.next.next; // move 2
        }
        prevSlow.next = slow.next;
        return head;



    }
}