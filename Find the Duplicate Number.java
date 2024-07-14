// ///////////////////////////////////////////
//             Challenge-45 Days
//               Arrays-1
//               DAY-1 Q-1
// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\



class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>a=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!a.add(nums[i])){
                return nums[i];
            }
            else{
                a.add(nums[i]);
            }
        }
        return -1;
    }
}


//IDEA Generation:

// Basic use of HashSet and its functionality if a number or a data wont get added into a hashset it means its already present EUREKA!!! thats what we want just return the element.

// TC:O(n)
// SC:O(n)
  
