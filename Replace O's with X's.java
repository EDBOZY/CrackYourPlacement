class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        for(int i=0;i<n;i++){
            if(a[i][0]=='O'){
                dfs(i,0,n,m,a);
            }
            if(a[i][m-1]=='O'){
                dfs(i,m-1,n,m,a);
            }
        }
        for(int i=0;i<m;i++){
            if(a[0][i]=='O'){
                dfs(0,i,n,m,a);
            }
            if(a[n-1][i]=='O'){
                dfs(n-1,i,n,m,a);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='O'){
                    a[i][j]='X';
                }
                if(a[i][j]=='1'){
                    a[i][j]='O';
                }
            }
        }
        return a;
        
    }
    static void dfs(int i,int j,int n,int m,char a[][]){
        if(i<0 || i>=n || j<0 || j>=m|| a[i][j]!='O'){
            return;
        }
        a[i][j]='1';
        dfs(i-1,j,n,m,a);
        dfs(i+1,j,n,m,a);
        dfs(i,j+1,n,m,a);
        dfs(i,j-1,n,m,a);
        
    }
}
