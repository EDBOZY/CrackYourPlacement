// ///////////////////////////////////////////
//             Challenge-45 Days
//               Arrays-1
//               DAY-1 Q-3
// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}


//IDEA Generation:

// Basic Logic

// TC:O(n)
// SC:O(1)
