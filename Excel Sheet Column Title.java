class Solution {
    public String convertToTitle(int b) {
        String a="";
        while(b>0){
            b--;
            a=(char)('A'+b%26)+a;
            b=b/26;
        }
        
        return a;
    }
}
