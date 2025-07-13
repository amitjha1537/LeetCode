class Solution {
    private boolean divide(int[] nums,int div, int t){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(int) Math.ceil((double)nums[i]/div);

        }
        return sum<=t;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=0;
        for(int arr:nums){
            if(arr>right){
                right=arr;
            }
        }
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(divide(nums, mid,threshold)==true){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
        
    }
}