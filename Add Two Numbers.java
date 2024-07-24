class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a=new ListNode(-1);
        ListNode ans=a;
        int c=0;

        while(l1!=null || l2!=null || c!=0){
            int s=0;
            if(l1!=null){
                s+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                s+=l2.val;
                l2=l2.next;
            }
            s=s+c;
            c=s/10;
            s=s%10;
            ans.next=new ListNode(s);
            ans=ans.next;
        }
        return a.next;
    }
}
