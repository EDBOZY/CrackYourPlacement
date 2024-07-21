class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[]a=new int[n-k+1];
        int l=0;
        Deque<Integer>b=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(!b.isEmpty() && b.peek()==i-k){
                b.poll();
            }
            while(!b.isEmpty() && nums[b.peekLast()]<=nums[i]){
                b.pollLast();
            }
            b.offer(i);
            if(i>=k-1){
                a[l++]=nums[b.peek()];
            }
        }
                    return a;

    }
}
