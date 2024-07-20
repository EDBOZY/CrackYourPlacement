class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        Arrays.sort(candidates);
        check(a,b,candidates,target,0);
        return a;
    }
    public void check(List<List<Integer>>a,List<Integer>b,int[]c,int t,int i){
        if(t==0){
            a.add(new ArrayList<>(b));
            return;
        }
        for(int j=i;j<c.length;j++){
            if(j>i && c[j]==c[j-1]){
                continue;
            }
            if(c[j]>t){
                break;
            }
            b.add(c[j]);
            check(a,b,c,t-c[j],j+1);
            b.remove(b.size()-1);
        }
    }
}
