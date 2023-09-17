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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
                return null;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode curr : lists) {
            while(curr != null) {
                pq.offer(curr.val);
                curr = curr.next;
            }
        }
        
        if(pq.isEmpty())
            return null;
        ListNode head = new ListNode(pq.poll());
        ListNode curr = head;
        while(!pq.isEmpty()) {
            curr.next = new ListNode(pq.poll());
            curr = curr.next;
        }
        return head;
    }
}