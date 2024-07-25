class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            long c=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    c=c*(long)nums[j];
                }
            }
            a[i]=c;
            c=1;
        }
        return a;
        
	} 
} 
