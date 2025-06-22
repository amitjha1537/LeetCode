class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int left=0;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(sum>=target){
                if(right-left+1<min){
                    min=right-left+1;
                }
                sum -=nums[left];
                left++;
            }
        }
    return min !=Integer.MAX_VALUE ? min :0;
        
    }
}