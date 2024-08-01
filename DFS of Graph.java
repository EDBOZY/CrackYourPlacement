class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>a=new ArrayList<>();
        boolean[]v=new boolean[V];
        dfs(0,v,adj,a);
        return a;
    }
    public void dfs(int a,boolean[]v,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>b){
        v[a]=true;
        b.add(a);
        for(int n:adj.get(a)){
            if(!v[n]){
                dfs(n,v,adj,b);
            }
        }
        
    }
}
