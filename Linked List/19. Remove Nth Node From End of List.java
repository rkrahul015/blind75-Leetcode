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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len =0;
        ListNode curr = head;
        while(curr != null) {
            len++;
            curr = curr.next;
        }
        int x = len-n;
        if(x==0)
            return head.next;
        int c=1;
        curr = head;
        while(c != x) {
            curr = curr.next;
            c++;
        }
        curr.next = curr.next.next;
        return head;
    }
}