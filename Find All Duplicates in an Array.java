// ///////////////////////////////////////////
//             Challenge-45 Days
//               Arrays-1
//               DAY-2 Q-9
// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\



class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // HashSet<Integer>a=new HashSet<>();
        List<Integer>b=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(!a.add(nums[i]) && !b.contains(nums[i])){
        //         b.add(nums[i]);
        //     }
        //     else{
        //         a.add(nums[i]);
        //     }
        // }
        // return b;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i] && !b.contains(nums[i-1])){
                b.add(nums[i-1]);
            }
        }
        return b;
    }
}
