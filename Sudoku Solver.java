class Solution {
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
    public boolean helper(char[][]board,int row,int col){
        if(row==board.length){
            return true;
        }
        int nr=0;
        int nc=0;
        if(col!=board.length-1){
            nr=row;
            nc=col+1;
        }
        else{
            nr=row+1;
            nc=0;
        }
        if(board[row][col]!='.'){
            if(helper(board,nr,nc)){
                return true;
            }
        }
        else{
            for(int i=1;i<10;i++){
                if(issafe(board,row,col,i)){
                    board[row][col]=(char)(i+'0');
                    if(helper(board,nr,nc)){
                        return true;
                    }
                    else{
                        board[row][col]='.';
                    }
                }
            }
        }
        return false;
    }
    public boolean issafe(char[][]board,int row,int col,int val){
        for(int i=0;i<board.length;i++){
            if(board[i][col]==(char)(val+'0')){
                return false;
            }
            if(board[row][i]==(char)(val+'0')){
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==(char)(val+'0')){
                    return false;
                }
            }
        }
        return true;
    }
}
