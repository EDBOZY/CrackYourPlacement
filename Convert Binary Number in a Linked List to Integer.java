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
    public int getDecimalValue(ListNode head) {
        // String a="";
        // while(head!=null){
        //     a+=String.valueOf(head.val);
        //     head=head.next;
        // }
        // return Integer.parseInt(a,2);
        StringBuilder a=new StringBuilder();
        ListNode temp=head;
        while(temp!=null){
            a.append(temp.val);
            temp=temp.next;
        }
        int ans = Integer.parseInt(a.toString(), 2);
        return ans;
    }
}
