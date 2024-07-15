class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=Integer.MIN_VALUE;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int w=j-i;
            ans=Math.max(ans,h*w);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}
