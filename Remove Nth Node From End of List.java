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
    public ListNode removeNthFromEnd(ListNode head, int p) {
        if (head == null || head.next == null)
            return null;
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        int k=n-p;
        if(n-p==0){
            return head.next;
        }
        ListNode t=head;
        int i=1;
        while(i<k){
            t=t.next;
            i++;
        }
        t.next=t.next.next;
        return head;
    }
}
