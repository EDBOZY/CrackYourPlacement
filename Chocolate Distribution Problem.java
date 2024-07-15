// ///////////////////////////////////////////
//             Challenge-45 Days
//               Arrays-1
//               DAY-2 Q-7
// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int i=0;
        int j=m-1;
        int d=Integer.MAX_VALUE;
        while(j<n){
            int min=a.get(j)-a.get(i);
            d=Math.min(d,min);
            i++;
            j++;
        }
        return d;
    }
}




//IDEA Generation:

// Sort then use 2 pointer then find the diff between the both.

// TC:O(n log n)
// SC:O(1)
