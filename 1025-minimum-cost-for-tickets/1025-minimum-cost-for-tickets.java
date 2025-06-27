class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Set<Integer> ans=new HashSet<>();
        int result=0;
        for(int day:days){
            ans.add(day);
        }
        int[] dp=new int[days[days.length-1]+1];
        for(int i=1;i<dp.length;i++){
            if(!ans.contains(i)){
                dp[i]=dp[i-1];
            }
            else{
                int one=dp[Math.max(0,i-1)]+costs[0];
                int two=dp[Math.max(0,i-7)]+costs[1];
                int three=dp[Math.max(0,i-30)]+costs[2];
                dp[i]=Math.min(one,Math.min(two,three));
            }
        
            
        }
        result=dp[dp.length-1];
        return result;
        
    }
}