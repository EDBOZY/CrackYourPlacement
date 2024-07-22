class Solution {
    List<Integer>a=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        check(root);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<a.size();i++){
            min=Math.min(min,a.get(i)-a.get(i-1));
        }
        return min;
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
