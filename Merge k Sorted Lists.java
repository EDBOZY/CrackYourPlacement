class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer>a=new PriorityQueue<>();
        for(ListNode b : lists){
            while(b!=null){
                a.add(b.val);
                b=b.next;
            }
        }
        ListNode ans=new ListNode(0);
        ListNode d=ans;
        while(!a.isEmpty()){
            ListNode s=new ListNode(a.poll());
            d.next=s;
            d=d.next;
        }
        return ans.next;
    }
}
