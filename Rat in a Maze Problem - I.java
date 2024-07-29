class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String>a=new ArrayList<>();
        boolean[][]path=new boolean[n][n];
        helper(a,m,n,0,0,"",path);
        Collections.sort(a);
        return a;
    }
    public static void helper(ArrayList<String>a,int[][]m,int n,int i,int j,String c,boolean[][] path){
        if(i==n-1 && j==n-1 && m[i][j]!=0){
            a.add(c);
            return;
        }
        if((i>=0 && i<n) && (j>=0 && j<n)){
            if(path[i][j]==true || m[i][j]==0){
                return;
            }
            
                path[i][j]=true;
                helper(a,m,n,i+1,j,c+'D',path);
                helper(a,m,n,i-1,j,c+'U',path);
                helper(a,m,n,i,j+1,c+'R',path);
                helper(a,m,n,i,j-1,c+'L',path);
                path[i][j]=false;
        }
    }
}
