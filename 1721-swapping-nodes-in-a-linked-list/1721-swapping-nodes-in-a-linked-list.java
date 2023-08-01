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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int n=1;
        while(temp.next!=null){
            n++;
            temp=temp.next;
        }
        temp=head;
        ListNode first=head;
        ListNode last=head;
        
        for(int i=1;i<=n;i++){
            if(i==k)
                first=temp;
            if(i==n-k+1)
                last=temp;
            temp=temp.next;
        }
        
        int value=first.val;
        first.val=last.val;
        last.val=value;
        return head;
    }
}