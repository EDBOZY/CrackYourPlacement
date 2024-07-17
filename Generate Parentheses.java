class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>a=new ArrayList<>();
        check(a,n,"",0,0);
        return a;
    }
    public void check(List<String>a,int n,String ans,int s,int e){
        if(s==n && n==e){
            a.add(ans);
            return;
        }
        if(s<n){
            check(a,n,ans+"(",s+1,e);
        }
        if(e<s){
            check(a,n,ans+")",s,e+1);
        }
    }
}
