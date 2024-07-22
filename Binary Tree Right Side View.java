class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>a=new ArrayList<>();
        Queue<TreeNode>b=new LinkedList<>();
        if(root==null){
            return a;
        }
        b.add(root);
        while(!b.isEmpty()){
            int c=b.size();
            for(int i=0;i<c;i++){
                TreeNode d=b.remove();
                if(i==c-1){
                    a.add(d.val);
                }
                if(d.left!=null){
                    b.add(d.left);
                }
                if(d.right!=null){
                    b.add(d.right);
                }
            }
        }
        return a;
    }
}
