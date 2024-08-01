class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>a=new ArrayList<>();
        boolean[]v=new boolean[V];
        Queue<Integer>b=new LinkedList<>();
        b.add(0);
        v[0]=true;
        while(!b.isEmpty()){
            int s=b.poll();
            a.add(s);
            for(int n:adj.get(s)){
                if(v[n]==false){
                    b.add(n);
                    v[n]=true;
                }
            }
        }
        return a;
    }
}


