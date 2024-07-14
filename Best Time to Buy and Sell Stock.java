// ///////////////////////////////////////////
//             Challenge-45 Days
//               Arrays-1
//               DAY-1 Q-6
// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

class Solution {
    public int maxProfit(int[] p) {
        int max=Integer.MIN_VALUE;
        int buy=p[0];
        for(int i=1;i<p.length;i++){
            int sel=p[i]-buy;
            max=Math.max(max,sel);
            buy=Math.min(buy,p[i]);
        }
        return max<0?0:max;
    }
}

//IDEA Generation:

// Basic use of min and max.

// TC:O(n)
// SC:O(1)
