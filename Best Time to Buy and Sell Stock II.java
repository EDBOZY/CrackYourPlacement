// ///////////////////////////////////////////
//             Challenge-45 Days
//               Arrays-1
//               DAY-2 Q-8
// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


class Solution {
    public int maxProfit(int[] prices) {
        int t=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                t+=prices[i]-prices[i-1];
            }
        }
        return t;
    }
}
