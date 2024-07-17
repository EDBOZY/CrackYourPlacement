class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer>a=new PriorityQueue<>((aa,b)->b-aa);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                a.add(matrix[i][j]);
                if(a.size()>k){
                    a.poll();
                }
            }
        }
        return a.poll();
        // int n=0;
        // while(!a.isEmpty() && n<k){
        // // for(int i=0;i<a.size()-k;i++){
        //     a.remove();
        //     n++;
        // }
        // return a.remove();
    }
}
