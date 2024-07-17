class Solution {
    public int maxProfit(int k, int[] prices) {
        int [][][]dp=new int[prices.length+1][2][k+1];
        for(int i=prices.length-1;i>=0;i--){
            for(int j=0;j<2;j++){
                for(int m=1;m<=k;m++){
                    int profit=0;
                    if(j==0){
                        profit=Math.max(dp[i+1][0][m],-prices[i]+dp[i+1][1][m]);
                    }
                    if(j==1){
                        profit=Math.max(dp[i+1][1][m],prices[i]+dp[i+1][0][m-1]);
                    }
                    dp[i][j][m]=profit;
                }
            }
        }
        return dp[0][0][k];
    }
}
