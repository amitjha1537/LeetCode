class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        int ans=0;
        if(n<2){
            return 0;
        }
        Arrays.sort(nums);
        
        for(int i=0;i<n-1;i++){
            int j=i+1;
            int temp=nums[j]-nums[i];
            j++;
             ans=Math.max(ans,temp);
            
            
        }
        
        return ans;
    }
}