class Solution {
 
    private boolean possible(int[] arr, int day,int m,int k){
        int count=0;
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                pos+=count/k;
                count=0;

            }
            
        }
        pos+=count/k;
        return pos>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n =bloomDay.length;
        if(m*k>n){
            return -1;
        }
        int left=bloomDay[0];
        int right=bloomDay[0];
        for(int i=0;i<n;i++){
            if(bloomDay[i]<left){
                left=bloomDay[i];
            }
            else if(bloomDay[i]>right){
                right=bloomDay[i];
            }


        }
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(possible(bloomDay,mid,m,k)==true){
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