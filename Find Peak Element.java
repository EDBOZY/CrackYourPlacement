class Solution {
    public int findPeakElement(int[] nums) {
        int j=0;
        int k=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(k<nums[i]){
                j=i;
                k=nums[i];
            }
        }
        return j;
    }
}
