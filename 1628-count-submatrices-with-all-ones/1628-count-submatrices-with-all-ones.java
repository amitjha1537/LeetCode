class Solution {
    public int numSubmat(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] dp=new int[n][m];
        int total=0;
    
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    dp[i][j]=(j==0?1:dp[i][j-1]+1);
                }
                int temp=dp[i][j];
                for(int k=i;k>=0&&dp[k][j]>0;k--){
                    temp=Math.min(temp,dp[k][j]);
                    total+=temp;
                }
                
                
            }
        }
        
        return total;
    }
}