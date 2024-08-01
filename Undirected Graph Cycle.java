class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[]vis=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(dfs(i,adj,vis,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int i,ArrayList<ArrayList<Integer>> adj,boolean[]vis,int parent){
        vis[i]=true;
        for(int j=0;j<adj.get(i).size();j++){
            int curr=adj.get(i).get(j);
            if(!vis[curr]){
                if(dfs(curr,adj,vis,i)){
                    return true;
                }
            }
            else if(vis[curr]&&curr!=parent){
                return true;
            }
        }
        return false;
    }
}
