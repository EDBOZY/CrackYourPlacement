class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        int n=nums.length;
        return help(nums,0,n-1);
    }
    public TreeNode help(int[]nums,int i,int j){
        if(i>j){
            return null;
        }
        int mid=i+(j-i)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=help(nums,i,mid-1);
        node.right=help(nums,mid+1,j);
        return node;
    }
}
