// ///////////////////////////////////////////
//             Challenge-45 Days
//               Arrays-1
//               DAY-1 Q-5
// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
    }
}


//IDEA Generation:

// Basic same idea as remove duplicate element.

// TC:O(n)
// SC:O(1)
