class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        Arrays.sort(nums);
        check(a,b,nums,0);
        return a;
    }
    public void check(List<List<Integer>>a,List<Integer>b,int[]nums,int i){
        if(!a.contains(new ArrayList<>(b))){
                a.add(new ArrayList<>(b));
        }
        if(i==nums.length){
            return;
        }
        b.add(nums[i]);
        check(a,b,nums,i+1);
        b.remove(b.size()-1);
        check(a,b,nums,i+1);

    }

}
