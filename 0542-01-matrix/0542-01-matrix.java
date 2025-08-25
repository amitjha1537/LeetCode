class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int max=n+m;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=0) dp[i][j]=max;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=0){
                    if(i>0){
                        dp[i][j]=Math.min(dp[i][j],dp[i-1][j]+1);
                    }
                    if(j>0){
                        dp[i][j]=Math.min(dp[i][j],dp[i][j-1]+1);
                    }
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i<n-1){
                    dp[i][j]=Math.min(dp[i][j],dp[i+1][j]+1);

                }
                if(j<m-1){
                    dp[i][j]=Math.min(dp[i][j],dp[i][j+1]+1);
                }
            }
        }
        return dp;
        
    }
}