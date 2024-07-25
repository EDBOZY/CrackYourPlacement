class Solution {
    public int uniquePathsIII(int[][] grid) {
        int x=0;
        int y=0;
        int z=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    x=i;
                    y=j;
                }
                if(grid[i][j]==0){
                    z++;
                }
            }
        }
        return help(grid,x,y,z);
    }
    public int help(int[][]grid,int x,int y,int z){
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y]==-1){
            return 0;
        }
        if(grid[x][y]==2){
            return z==-1?1:0;
        }
        grid[x][y]=-1;
        z--;
        int total=help(grid,x+1,y,z)+help(grid,x-1,y,z)+help(grid,x,y+1,z)+help(grid,x,y-1,z);
        z++;
        grid[x][y]=0;
        return total;
    }
}
