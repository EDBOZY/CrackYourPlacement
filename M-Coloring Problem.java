//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends




class solve {
    
     // Function to determine if the graph can be coloured with at most M colours
    // such that no two adjacent vertices of the graph are coloured with the same colour.
    
    //Swapnil Patel
    
    public boolean graphColoring(boolean graph[][], int m, int n) {
        
        int[] colurs = new int[n];
        
        return solve(graph, colurs, 0, m);
    }

    boolean solve(boolean graph[][], int[] colurs, int node, int m) {
        if (node == graph.length)
                return true;
        for (int i = 1; i <= m; i++) 
        {
            if (isColourable(graph, colurs, node, i)) 
            {
                colurs[node] = i;
                if (solve(graph, colurs, node + 1, m))
                    return true;
                else
                    colurs[node] = 0;
            }
        }
        return false;
    }

    boolean isColourable(boolean graph[][], int[] colurs, int node, int color)
    {
        for (int i = 0; i < graph.length; i++) 
        {
            if (graph[node][i] == true && colurs[i] == color)
            {
                return false;
            }
        }
        return true;
    }
}
