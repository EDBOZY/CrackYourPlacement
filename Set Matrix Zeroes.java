// ///////////////////////////////////////////
//             Challenge-45 Days
//               Arrays-1
//               DAY-1 Q-4
// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


class Solution {
    public void setZeroes(int[][] matrix) {
        int r[]=new int[matrix.length];
        int c[]=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r[i]=1;
                    c[j]=1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(r[i]==1||c[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}


//IDEA Generation:

// So first step was to find out all the index values of the matrix where
  // all it was 0 after that where we can just simply mark 0 now now now i used
  // 2 arrays because we need to mark the complete row or the complete column
  // so we can just take 2 arrays and check if any one of them is true make 
  // that 0 this is what i have done in the second part of the code.

// TC:O(n*m)
// SC:O(n+m)
