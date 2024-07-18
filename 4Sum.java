class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums==null || nums.length<4){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int l=j+1;
                int r=nums.length-1;
                while(l<r){
                    if((long)nums[i]+(long)nums[j]+(long)nums[l]+(long)nums[r]==target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;

                    }
                    else if((long)nums[i]+(long)nums[j]+(long)nums[l]+(long)nums[r]<target){
                        l++;
                    }
                    else{
                        r--;
                    }

                }
            }
        }
        return new ArrayList<>(result);

    }
}
