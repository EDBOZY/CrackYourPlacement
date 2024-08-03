class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]>a=new LinkedList<>();
        int fc=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    a.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fc++;
                }
            }
        }
        int rt=0;
        int mr=0;
        int[][]dir={{1,0},{-1,0},{0,1},{0,-1}};
        while(!a.isEmpty() && fc>0){
            rt++;
            int qs=a.size();
            for(int i=0;i<qs;i++){
                int []curr=a.remove();
                int x=curr[0];
                int y=curr[1];
                for(int j=0;j<4;j++){
                    int nx=x+dir[j][0];
                    int ny=y+dir[j][1];
                    if(nx>=0 && ny>=0 && nx<m && ny<n && grid[nx][ny]==1){
                        grid[nx][ny]=2;
                        a.add(new int[]{nx,ny});
                        fc--;
                    }
                }
            }
        }
        return fc==0?rt:-1;
    }
}
