class Solution {
    public int characterReplacement(String s, int k) {
        // int i=0;
        int j=0;
        int max=0;
        int ans=0;
        int[]a=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'A']++;
            max=Math.max(max,a[s.charAt(i)-'A']);
            while(i-j-max+1>k){
                a[s.charAt(j)-'A']--;
                j++;
            }
            ans=Math.max(ans,i-j+1);
            // i++;

        }
        return ans;
    }
}
