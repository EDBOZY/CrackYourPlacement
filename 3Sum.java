class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>a=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i==0||(i>0 && nums[i]!=nums[i-1])){
                int j=i+1;
                int k=n-1;
                int b=0-nums[i];
                while(j<k){
                    if(nums[j]+nums[k]==b){
                        a.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        while(j<k && nums[j]==nums[j+1]){
                            j++;
                        }
                        while(j<k && nums[k]==nums[k-1]){
                            k--;
                        }
                        j++;
                        k--;
                    }
                    else if(nums[j]+nums[k]>b){
                        k--;
                    }
                    else{
                        j++;
                    }

                }
            }
        }
        return a;
    }
}
