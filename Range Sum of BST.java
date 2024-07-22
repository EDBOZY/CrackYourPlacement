class Solution {
    int a=0;
    public int rangeSumBST(TreeNode root, int l, int h) {
        help(root,l,h);
        return a;
    }
    public void help(TreeNode root,int l,int h){
        if(root==null){
            return ;
        }
        help(root.left,l,h);
        if(root.val>=l && root.val<=h){
            a=a+root.val;
        }
        help(root.right,l,h);
    }
}
