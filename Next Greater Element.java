
class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Integer>a=new Stack<>();
        long[]b=new long[n];
        for(int i=n-1;i>=0;i--){
            while(!a.isEmpty() && arr[i]>=arr[a.peek()]){
                a.pop();
            }
            if(a.isEmpty()){
                b[i]=-1;
            }
            else{
                b[i]=arr[a.peek()];
            }
            a.push(i);
        }
        return b;
    } 
}
