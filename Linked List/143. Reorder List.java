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
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = reverse(slow.next);
        slow.next = null;
        ListNode curr = head;
        while(mid != null) {
            ListNode temp1 = mid.next;
            ListNode temp2 = curr.next;
            curr.next = mid;
            mid.next = temp2;
            mid = temp1;
            curr = temp2;
        }
    }
    
    public ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null;
        while(curr != null) {
            ListNode tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }
        return prev;
    }
    
}