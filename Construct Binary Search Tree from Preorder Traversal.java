class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            root=insert(root,preorder[i]);
        }
        return root;
    }
    public TreeNode insert(TreeNode root,int a){
        if(root==null){
            return new TreeNode(a);
        }
        if(root.val>a){
            root.left=insert(root.left,a);
        }
        if(root.val<a){
            root.right=insert(root.right,a);
        }
        return root;
    }
}
