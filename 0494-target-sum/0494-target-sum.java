class Solution {
    public int findTargetSumWays(int[] arr, int d) {

        int n=arr.length;
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
     if ((sum + d) % 2 != 0 || sum < Math.abs(d)) {
    return 0;
}
int s = (sum + d) / 2;
if (s < 0) return 0;
        int[][] dp=new int[n+1][s+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<s+1;j++){
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0){
                    dp[i][j]=1;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=0;j<s+1;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][s];
    }
}

        
  