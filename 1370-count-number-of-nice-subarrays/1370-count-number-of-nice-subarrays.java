class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countk(nums,k)-countk(nums,k-1);
    }
        public int countk(int[]nums, int k){
int n=nums.length;
        int left=0;
        int right=0;
        int count=0;
        int sum=0;
        while(right<n){
            sum+=nums[right]%2;
            while(sum>k){
                sum=sum-nums[left]%2;
                left=left+1;
            }
            
            count+=right-left+1;
            right=right+1;

        }
        return count;
        }
        
        
    
}