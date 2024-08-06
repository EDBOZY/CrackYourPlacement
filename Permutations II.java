class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        HashMap<Integer,Integer>c=new HashMap<>();
        help(nums,a,b,c);
        return a;
    }
    public void help(int[]nums,List<List<Integer>>a,List<Integer>b,HashMap<Integer,Integer>c){
        if(b.size()==nums.length){
            if(!a.contains(b)){
                a.add(new ArrayList<>(b));
            }
            return;
        }
        for(int j=0;j<nums.length;j++){ 
                   if(!c.containsKey(j)){
                        c.put(j,1);
                        b.add(nums[j]); 
                        help(nums,a,b,c);
                        b.remove(b.size()-1);
                        c.remove(j);
                   }
               }

    }
}
