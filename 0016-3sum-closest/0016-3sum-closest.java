class Solution {
    public int threeSumClosest(int[] nums, int target) {
              if(nums.length<3) return -1;
        Arrays.sort(nums);
        int n=nums.length;
  int ans=nums[0]+nums[1]+nums[2];
        int sum=0;
        int diff=0;
       
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                sum=nums[i]+nums[left]+nums[right];
                if(target==sum)return sum;
                if(Math.abs(sum-target)<Math.abs(ans-target)){
                    ans=sum;
                }
                if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
            
            
        }
        
        return ans;
        
    }
}