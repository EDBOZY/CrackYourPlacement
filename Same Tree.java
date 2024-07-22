class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q==null && p==null){
            return true;
        }
        if(q==null||p==null || (q.val!=p.val)){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
