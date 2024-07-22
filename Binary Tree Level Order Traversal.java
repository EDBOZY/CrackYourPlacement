class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>a=new ArrayList<>();
        Queue<TreeNode>b=new LinkedList<>();
        if(root==null){
            return a;
        }
        b.add(root);
        while(!b.isEmpty()){
            int c=b.size();
            List<Integer>d=new ArrayList<>();
            for(int i=0;i<c;i++){
                TreeNode cc=b.remove();
                d.add(cc.val);
                if(cc.left!=null){
                    b.add(cc.left);
                }
                if(cc.right!=null){
                    b.add(cc.right);
                }
            }
            a.add(d);

        }
        return a;
    }
}
