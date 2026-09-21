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
    public ListNode reverseList(ListNode head) {

        ListNode current = head; // points to node 0
        ListNode prev = null; // nothing comes before node 0
        
        while(current != null){
            ListNode next = current.next; // save node 1 before we lose it
            current.next = prev;
            prev = current;
            current = next;
            
        }

        return prev;
    }
}
