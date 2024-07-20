class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        check(n,k,1,a,b);
        return a;
    }
    public void check(int n,int k,int i,List<List<Integer>>a,List<Integer>b){
        if(b.size()==k){
            a.add(new ArrayList<>(b));
            return;
        }
        for(int j=i;j<=n;j++){
            b.add(j);
            check(n,k,j+1,a,b);
            b.remove(b.size()-1);
        }
    }
}
