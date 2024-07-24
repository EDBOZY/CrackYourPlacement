class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long mod=1000000007;
        long n=0;
        long m=0;
        while(first!=null){
            n=(n*10+first.data)%mod;
            first=first.next;
        }
        while(second!=null){
            m=(m*10+second.data)%mod;
            second=second.next;
        }
        return (n*m)%mod;
    }
}
