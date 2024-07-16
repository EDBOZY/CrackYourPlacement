class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        String c="";
        int i=0;
        int j=0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                c=c+a.charAt(i);
                i++;
                j++;
            }
            else{
                return c;
            }
        }
        return c;
    }
}
