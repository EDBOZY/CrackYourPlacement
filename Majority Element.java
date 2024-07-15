class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>a=new HashMap<>();
        int n=nums.length/2;
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
            if(a.get(nums[i])>n){
                return nums[i];
            }

        }
        return -1;
    }
}
