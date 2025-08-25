class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        int start=image[sr][sc];
        dfs(image,sr,sc,start,color);
        return image;

        
    }
    private void dfs(int[][] image, int r, int c, int start, int newColor){
        if(r<0||c<0||r>=image.length||c>=image[0].length) return ;
        if(image[r][c]!=start) return;
        image[r][c]=newColor;
        dfs(image,r-1,c,start,newColor);
        dfs(image,r+1,c,start,newColor);
        dfs(image,r,c-1,start,newColor);
        dfs(image,r,c+1,start,newColor);

    }
   
}