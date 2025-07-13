class Solution {
    private boolean check(int []arr, int mid,int h){
        int hrs=0;
        for(int i=0;i<arr.length;i++){
            hrs+=(int) Math.ceil((double)arr[i]/mid);

        }
        return hrs<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
       
        int left=1;
        int right=Integer.MAX_VALUE;
        
        
        int ans=0;
        while(left<=right){
            
            int mid=left+(right-left)/2;

            if(check(piles,mid,h)==true){
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