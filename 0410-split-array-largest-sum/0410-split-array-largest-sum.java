class Solution {
    private boolean check(int[] arr, int mid, int k){
        int count=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid) return false;
            if(sum+arr[i]>mid){
                count++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return count<=k;

    }


    public int splitArray(int[] nums, int k) {
        if(k>nums.length){
            return -1;
        }
        
        int left=nums[0];
        int right=0;
        for(int i=0;i<nums.length;i++){
           left=Math.max(left,nums[i]);
           right+=nums[i];
        }
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(check(nums,mid,k)==true){
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