//BFS
class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int []indeg=new int[V];
        for(int i=0;i<V;i++){
            for(int j:adj.get(i)){
                indeg[j]++;
            }
        }
        Queue<Integer>a=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indeg[i]==0){
                a.add(i);
            }
        }
        int[]ans=new int[V];
        int o=0;
        while(!a.isEmpty()){
            int node=a.remove();
            ans[o++]=node;
            for(int k:adj.get(node)){
                indeg[k]--;
                if(indeg[k]==0){
                    a.add(k);
                }
            }
        }
        return ans;
    }
}
