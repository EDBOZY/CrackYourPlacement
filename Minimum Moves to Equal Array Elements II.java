class Solution {
    public int minMoves2(int[] nums) {
        // int n=nums.length;
        // int s=0;
        // for(int i=0;i<nums.length;i++){
        //     s+=nums[i];
        // }
        // int d=s%n;
        // if(d!=0){
        //     s=s-d;
        //     // s=s+n;
        // }
        // int g=s/n;
        // int c=0;
        // for(int i=0;i<n;i++){
        //     c=c+Math.abs(nums[i]-g);
        // }
        // return c;

        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        int moves = 0;
        for (int num : nums) {
            moves += Math.abs(num - median);
        }
        return moves;


    }
}
