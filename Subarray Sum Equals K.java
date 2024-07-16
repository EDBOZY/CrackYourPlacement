class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>a=new HashMap<>();
        a.put(0,1);
        int s=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
            if(a.containsKey(s-k)){
                c+=a.get(s-k);
            }
            a.put(s,a.getOrDefault(s,0)+1);
        }
        return c;
    }
}
