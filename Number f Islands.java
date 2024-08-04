class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        if(grid==null || grid.length==0 ){
            return 0;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    dfs(grid,i,j);
                }
            }
        }
        return ans;
    }
    public void dfs(char[][]grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length||grid[i][j]!='1'){
            return;
        }
        grid[i][j]='2';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);

    }
}
