class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode b=new ListNode(-1);
        ListNode a=new ListNode(-1);
        ListNode bh=b;
        ListNode ah=a;
        while(head!=null){
            if(head.val<x){
                bh.next=head;
                bh=bh.next;
                // bh=head;
                head=head.next;
            }
            else{
                ah.next=head;
                // ah=head;
                ah=ah.next;
                head=head.next;
            }
        }
        ah.next=null;
        bh.next=a.next;
        return b.next;
    }
}
