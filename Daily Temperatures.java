class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer>a=new Stack<>();
        int[]d=new int[t.length];
        for(int i=t.length-1;i>=0;i--){
            while(!a.isEmpty() && t[i]>=t[a.peek()]){
                a.pop();
            }
            if(a.isEmpty()){
                d[i]=0;
            }
            else{
                d[i]=a.peek()-i;
            }
            a.push(i);
        }
        return d;
    }
}
