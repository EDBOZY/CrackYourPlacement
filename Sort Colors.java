// ///////////////////////////////////////////
//             Challenge-45 Days
//               Arrays-1
//               DAY-1 Q-2
// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
}



//IDEA Generation:

// Basic Arrays.sort can be use but the TC is high , so we have to use THE DUTCH FLAG ALGO .

// TC:O(n)
// SC:O(1)
  
