class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(maxDepth(root)==-1){
            return false;
        }
        return true;
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        if(l==-1||r==-1){
            return -1;
        }
        if(Math.abs(l-r)>1){
            return -1;
        }

        return Math.max(l,r)+1;
    }
}
