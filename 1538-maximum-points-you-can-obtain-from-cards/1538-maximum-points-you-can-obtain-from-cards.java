class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if(k>cardPoints.length) return 0;
        int leftsum=0;
        int sum=0;
        int rightsum=0;
        int n=cardPoints.length;
        int r=n-1;
        for(int i=0;i<k;i++){
            leftsum=leftsum+cardPoints[i];
        }
        sum=leftsum;
        for(int i=k-1;i>=0;i--){
            leftsum=leftsum-cardPoints[i];
            rightsum=rightsum+cardPoints[r];
            r--;
            sum=Math.max(sum,leftsum+rightsum);
                    }
        return sum;



        
    }
}