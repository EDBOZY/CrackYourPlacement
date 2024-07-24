class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || left==right){
            return head;
        }
        ListNode dummy=new ListNode(0,head);
        ListNode leftNode=dummy;
        for(int i=0;i<left-1;i++){
            leftNode=leftNode.next;
        }
        ListNode newRight=leftNode.next;
        ListNode cur = newRight;
        ListNode prev = null;
        ListNode nex=null;
        while(left++ <= right) {
            nex = cur.next;
            cur.next = prev; 
            prev = cur;     
            cur = nex;
        }
        leftNode.next=prev;
        newRight.next=cur;

        return dummy.next;

    }
}
