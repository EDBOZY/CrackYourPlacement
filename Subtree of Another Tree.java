class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return subRoot==null;
        }
        if(help(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    public boolean help(TreeNode root,TreeNode root2){
        if(root==null && root2==null){
            return true;
        }
        if(root==null || root2==null || root.val!=root2.val){
            return false;
        }
        return help(root.left,root2.left)&&help(root.right,root2.right);
    }
}
