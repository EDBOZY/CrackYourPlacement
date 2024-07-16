class Solution {
    public int maxScore(int[] c, int k) {
        int leftsum=0;
        int rightsum=0;
        int ans=0;
        for(int i=0;i<k;i++){
            leftsum+=c[i];
        }
        ans=leftsum;
        int n=c.length-1;
        for(int i=k-1;i>=0;i--){
            leftsum-=c[i];
            rightsum+=c[n];
            ans=Math.max(ans,leftsum+rightsum);
            n--;
        }
        return ans;
    }
}
