class Solution {
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        maxDepth(root);
        return d-1;
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        int dd=l+r+1;
        d=Math.max(d,dd);
        return Math.max(l,r)+1;
    }
}
