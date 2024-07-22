class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSameTree(root.left,root.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q==null && p==null){
            return true;
        }
        if(q==null||p==null || (q.val!=p.val)){
            return false;
        }
        return isSameTree(p.left,q.right) && isSameTree(p.right,q.left);
    }
}
