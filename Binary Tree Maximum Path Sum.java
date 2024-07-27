class Solution {
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        max(root);
        return ans;
    }
    public int max(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=max(root.left);
        int r=max(root.right);
        l=Math.max(0,l);
        r=Math.max(0,r);
        ans=Math.max(ans,l+r+root.val);
        return Math.max(l,r)+root.val;
    }
}
