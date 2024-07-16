class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>a=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        int ind=a.size()-k;
        int i=0;
        while(!a.isEmpty()){
            if(i==ind){
                return a.poll();
            }
            else{
                i++;
                a.poll();
            }
        }
        return -1;
        // Arrays.sort(nums);
        // return nums[nums.length-k];
    }
}
