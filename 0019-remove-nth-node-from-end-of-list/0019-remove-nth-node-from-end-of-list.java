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
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int x=size-n;
        if(size==1 && n==1)
            return null;
        if(n==size){
            head=head.next;
            return head;
        }
            
        ListNode prev=head;
        while(x>1){
            prev=prev.next;
            x--;
        }
        prev.next=prev.next.next;
        return head;
    }
}