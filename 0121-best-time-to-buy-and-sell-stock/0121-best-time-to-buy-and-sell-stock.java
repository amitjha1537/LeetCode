class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int min=prices[0];
        for(int i=1;i<n;i++){
            int pr=prices[i]-min;
            profit=Math.max(profit,pr);
            min=Math.min(min,prices[i]);
        }
        return (profit>0)?profit:0;        
    }
}