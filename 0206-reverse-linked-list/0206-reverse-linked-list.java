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
        // ListNode curr = head;
        // ListNode pre = null;
        // ListNode next = null;
        // while(curr != null){
        //     next = curr.next;
        //     curr.next = pre;
        //     pre = curr;
        //     curr = next;
        // }
        // return pre;
        if(head == null){
            return null;
        }
        else if(head.next == null){
            return head;
        }
        else{
            ListNode nextNode = head.next;
            head.next = null;
            ListNode rest = reverseList(nextNode);
            nextNode.next = head;
            return rest;
        }
    }
}