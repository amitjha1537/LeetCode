class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        for(int i=0;i<n;i++){
             
             right=sum-nums[i]-left;
            if(left==right) return i;
            left+=nums[i];

        }
        return -1;
        
    }
}