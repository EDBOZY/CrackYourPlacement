class Solution {
    public int repeatedStringMatch(String a, String b) {
        if(b==""){
            return 0;
        }
        if(a.equals(b) || a.indexOf(b)!=-1){
            return 1;
        }
        String t=a;
        for(int i=0;i<b.length();i++){
            a=a+t;
            if(a.indexOf(b)!=-1){
                return i+2;
            }

        }
        return -1;
    }
}
