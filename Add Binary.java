class Solution {
    public String addBinary(String a, String b) {
        StringBuilder aa=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        while(i>=0 || j>=0|| c==1){
            if(i>=0){
                c+=a.charAt(i--)-'0';
            }
            if(j>=0){
                c+=b.charAt(j--)-'0';
            }
            aa.append(c%2);
            c/=2;
        }
        return aa.reverse().toString();
    }
}
