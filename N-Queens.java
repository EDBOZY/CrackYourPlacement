class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>a=new ArrayList<>();
        char[][] board=new char[n][n];
        helper(a,board,0);
        return a;
    }
    public void helper(List<List<String>>a,char[][]board,int col){
        if(col==board.length){
            save(a,board);
            return;
            // col=0;
        }
        for(int i=0;i<board.length;i++){
            if(issafe(i,col,board)){
                board[i][col]='Q';
                helper(a,board,col+1);
                board[i][col]='.';
            }
        }

    }
    public void save(List<List<String>>a,char[][]board){
        String row="";
        List<String>b=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
            }
            b.add(row);
        }
        a.add(b);
    }
    public boolean issafe(int row,int col,char[][]board){
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }

        //diagonals
        int r=row;
        for(int i=col;i>=0 && r>=0;i--,r--){
            if(board[r][i]=='Q'){
                return false;
            }
        }
         r=row;
        for(int i=col;i<board.length && r>=0;i++,r--){
            if(board[r][i]=='Q'){
                return false;
            }
        }
         r=row;
        for(int i=col;i>=0 && r<board.length;i--,r++){
            if(board[r][i]=='Q'){
                return false;
            }
        }
         r=row;
        for(int i=col;i<board.length && r<board.length;i++,r++){
            if(board[r][i]=='Q'){
                return false;
            }
        }
        return true;

    }
}
