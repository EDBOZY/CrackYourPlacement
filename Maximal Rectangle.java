class Solution {
    public int largestRectangleArea(int[] h) {
        int n=h.length;
        int[]r=new int[n];
        int[]l=new int[n];
        Stack<Integer>a=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!a.isEmpty() && h[a.peek()]>=h[i]){
                a.pop();
            }
            if(a.isEmpty()){
                r[i]=n;
            }
            else{
                r[i]=a.peek();
            }
            a.push(i);

        }
        Stack<Integer>b=new Stack<>();
        for(int i=0;i<n;i++){
            while(!b.isEmpty() && h[b.peek()]>=h[i]){
                b.pop();
            }
            if(b.isEmpty()){
                l[i]=-1;
            }
            else{
                l[i]=b.peek();
            }
            b.push(i);
        }

        int max=0;
        for(int i=0;i<n;i++){
            int t=r[i]-l[i]-1;
            int to=h[i]*t;
            max=Math.max(max,to);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0)
        return 0;

        int ans = 0;
        int[] answer = new int[matrix[0].length];

        for (char[] row : matrix) {
        for (int i = 0; i < row.length; ++i)
            answer[i] = row[i] == '0' ? 0 : answer[i] + 1;
        ans = Math.max(ans, largestRectangleArea(answer));
        }

        return ans;
    }
}
