class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>a=new ArrayList<>();
        if(root==null){
            return a;
        }
        int cc=1;
        Queue<TreeNode>b=new LinkedList<>();
        b.add(root);
        while(!b.isEmpty()){
            int c=b.size();
            List<Integer>d=new ArrayList<>();
            for(int i=0;i<c;i++){
                TreeNode e=b.remove();
                d.add(e.val);
                if(e.left!=null){
                    b.add(e.left);
                }
                if(e.right!=null){
                    b.add(e.right);
                }
            }
            if(cc%2==0){
                Collections.reverse(d);
                a.add(d);
            }
            else{
                a.add(d);
            }
            cc++;
        }
        return a;
    }
}
