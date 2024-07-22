class Solution {
    public boolean isValidBST(TreeNode root) {
        return help(root,null,null);
    }
    public boolean help(TreeNode root,Integer low,Integer high){
        if(root==null){
            return true;
        }
        if(low!=null && root.val<=low){
            return false;
        }
        if(high!=null && root.val>=high){
            return false;
        }
        boolean l=help(root.left,low,root.val);
        boolean r=help(root.right,root.val,high);
        return l&&r;
    }
}
