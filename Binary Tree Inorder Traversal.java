class Solution {
    List<Integer>a=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        check(root);
        return a;
    }
    public void check(TreeNode root){
        if(root==null){
            return;
        }
        check(root.left);
        a.add(root.val);
        check(root.right);
    }
}
