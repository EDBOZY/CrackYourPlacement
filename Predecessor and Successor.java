class Solution {
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // code here.
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
        Node p=root;
        Node q=root;
        while(q!=null || p!=null){
            if(q!=null){
                if(q.data<=key){
                    q=q.right;
                }
                else{
                    suc[0]=q;
                    q=q.left;
                }
            }
            if(p!=null){
                if(p.data>=key){
                    p=p.left;
                }
                else{
                    pre[0]=p;
                    p=p.right;
                }
            }
        }
    }
}
