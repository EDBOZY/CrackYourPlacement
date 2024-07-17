class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int c=0;
        int s=0;
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int i=0;i<n;i++){
            s+=arr[i];
            if(s==0){
                c=i+1;
            }
            if(a.containsKey(s)){
                c=Math.max(c,i-a.get(s));
            }
            else{
            a.put(s,i);
            }
        }
        return c;
    }
}
