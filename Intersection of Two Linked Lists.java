public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode>a=new ArrayList<>();
        while(headA!=null){
            a.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(a.contains(headB)){
                return headB;
            }
            else{
                a.add(headB);
                headB=headB.next;
            }
        }
        return null;
    }
}
