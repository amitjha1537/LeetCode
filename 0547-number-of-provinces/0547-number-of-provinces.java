class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        int[]vis=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(isConnected,vis,i);
                count++;
            }
        }
        return count;
        
    }
    private void dfs(int[][] mat, int[] vis, int i){
        vis[i]=1;
        for(int j=0;j<mat.length;j++){
            if(mat[i][j]==1&&vis[j]==0){
                dfs(mat,vis,j);
            }
        }
    }
}