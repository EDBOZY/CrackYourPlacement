class Solution {
    public boolean exist(char[][] board, String word) {
        boolean path[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(check(board,word,0,i,j,path)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean check(char[][]b,String word,int ans,int i,int j,boolean path[][]){
        if(ans==word.length()){
            return true;
        }
        if(i<0 || i==b.length || j<0 || j==b[0].length||path[i][j]==true||b[i][j]!=word.charAt(ans)){
            return false;
        }
        path[i][j]=true;
        boolean u=check(b,word,ans+1,i-1,j,path);
        boolean d=check(b,word,ans+1,i+1,j,path);
        boolean l=check(b,word,ans+1,i,j-1,path);
        boolean r=check(b,word,ans+1,i,j+1,path);
        path[i][j]=false;

        return u||d||l||r;

    }
}
