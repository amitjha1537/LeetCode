class Solution {
    private int check(int[] arr, int capacity){
        int days=1;
        int load=0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>capacity){
                days=days+1;
                load=0;
                load=load+arr[i];
            }
            else{
                load=load+arr[i];
            }
        }
        return days;


    }
    public int shipWithinDays(int[] weights, int days) {
        int right=0;
        int left=weights[0];
        for(int i=0;i<weights.length;i++){
            right=right+weights[i];
            if(weights[i]>left){
                left=weights[i];
            }

        }
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(check(weights,mid)<=days){
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