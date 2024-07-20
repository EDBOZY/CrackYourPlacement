class Solution {
    public int search(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        // }
        // return -1;


        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[l]<=nums[mid]){
                if(target>nums[mid]||target<nums[l]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
            else{
                if(target<nums[mid] || target>nums[r]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
        }
        return -1;
    }
}
