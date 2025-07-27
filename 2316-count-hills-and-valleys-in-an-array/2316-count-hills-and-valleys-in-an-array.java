class Solution {
    public int countHillValley(int[] nums) {
        if(nums.length<3) return 0;
        int n=nums.length;
        int count=0;
        int i=0;
        int j=1;
        while(j<n-1&&i<n){
            if((nums[i]<nums[j]&&nums[j]>nums[j+1])||(nums[i]>nums[j]&& nums[j]<nums[j+1])){
                count++;
                i=j;
                j=j+1;
            }
            else if(nums[j]==nums[j+1]){
                j=j+1;
            }
            else{
                i=j;
                j=j+1;
            }
        }
        return count;
        
    }
}