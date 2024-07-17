class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<amount+1;i++){
            if(i%coins[0]==0){
                dp[0][i]=i/coins[0];
            }
            else{
                dp[0][i]=(int)Math.pow(10,9);
            }
        }
        for(int i=1;i<coins.length;i++){
            for(int j=1;j<=amount;j++){
                int not=dp[i-1][j];
                int taken=(int)Math.pow(10,9);
                if(coins[i]<=j){
                    taken=1+dp[i][j-coins[i]];
                }
                dp[i][j]=Math.min(not,taken);
            }
        }
        if(dp[coins.length-1][amount]>=(int)Math.pow(10,9)){
            return -1;
        }
        return dp[coins.length-1][amount];
    }
}
