class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image == null || image.length == 0 || image[sr][sc] == color) {
            return image;
        }
        int given = image[sr][sc];
        dfs(image, given, color, sr, sc);
        return image;
    }
    void dfs(int[][] image, int given, int color, int r, int c){
        if(r<0 || c<0 || r>=image.length || c>=image[0].length) return;
        if(image[r][c] != given) return;
        image[r][c] = color;
        dfs(image, given, color, r+1, c);
        dfs(image, given, color, r-1, c);
        dfs(image, given, color, r, c+1);
        dfs(image, given, color, r, c-1);
    }
}
