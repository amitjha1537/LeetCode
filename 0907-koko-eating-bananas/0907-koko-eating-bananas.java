class Solution {
    private boolean perh(int[] piles,int h, int k){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=(int)Math.ceil((double)piles[i]/k);
        }
        return hours<=h;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=Integer.MAX_VALUE;
        int result=right;
        
        while(left<=right){
            int mid=left+(right-left)/2;
           if(perh(piles,h,mid)){

           result=mid;
           
            right=mid-1;
           }            
           else{
            left=mid+1;
           }
        }
        return result;
    }
}