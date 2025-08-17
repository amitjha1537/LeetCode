class Solution {
    public int longestPalindromeSubseq(String s) {
        // in java if you to initialize the row 1 and column 1 by 0 
      //  there is no need as in java by default in places are occupied by 0
      // but in good practice you should do, so in case u have do it otherwise so you should be prepared
      String rev=new StringBuilder(s).reverse().toString();
      int n=s.length();
      int[][] dp=new int[n+1][n+1];
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(s.charAt(i-1)==rev.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
            }
            else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
      } 
      return dp[n][n];
        
    }
}