class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer>a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    c++;
                }
            }
            a.add(c);
            
        }
        return a;
    }
}
