/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         ListNode slow_p = head, fast_p = head;
 
        while (slow_p != null && fast_p != null
               && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
 
            /* If slow_p and fast_p meet at some point
            then there is a loop */
            if (slow_p == fast_p)
                return true;
        }
 
        /* Return 0 to indicate that there is no loop*/
        return false;
    }
}