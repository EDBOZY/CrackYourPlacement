class Solution {
    public int[] countBits(int n) {
        int[]a=new int[n+1];
        for(int i=0;i<=n;i++){
            a[i]=check(i);
        }
        return a;
    }
    public int check(int n){
        String b=Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
}
