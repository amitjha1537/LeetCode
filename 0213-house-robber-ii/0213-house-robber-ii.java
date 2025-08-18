class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int case1=check(0,n-2,nums);
        int case2=check(1,n-1,nums);
        return Math.max(case1, case2);
        
    }
    private int check(int start, int end,int[] nums){
        int len=end-start+1;
        int[] dp= new int[len+1];
        dp[0]=0;
        dp[1]=nums[start];
        for(int i=2;i<len+1;i++){
            dp[i]=Math.max(dp[i-1],nums[start+i-1]+dp[i-2]);
        }
        return dp[len];
    }
}