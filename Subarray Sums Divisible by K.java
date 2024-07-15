class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int s=0;
        int c=0;
        HashMap<Integer,Integer>a=new HashMap<>();
        a.put(0,1);
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
            int r=s%k;
            if(r<0){
                r+=k;
            }
            if(a.containsKey(r)){
                c=c+a.get(r);
                // a.put()
                // a.put(r,)
            }
            a.put(r,a.getOrDefault(r,0)+1);
        }
        return c;
    }
}
