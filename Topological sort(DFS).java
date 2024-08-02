//DFS
class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        Stack<Integer>a=new Stack<>();
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(i,adj,a,vis);
            }
        }
        int[]s=new int[V];
        int j=0;
        while(!a.isEmpty()){
            s[j++]=a.pop();
        }
        return s;
    }
    static void dfs(int j,ArrayList<ArrayList<Integer>> adj,Stack<Integer>a,boolean vis[]){
        vis[j]=true;
        for(int n:adj.get(j)){
            if(!vis[n]){
                dfs(n,adj,a,vis);
            }
        }
        a.push(j);
    }
}
