class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum=Arrays.stream(gas).sum();
        int costSum=Arrays.stream(cost).sum();
        if(gasSum<costSum){
            return -1;
        }
        int start=0;
        int sum=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            sum+=gas[i]-cost[i];
            if(sum<0){
                sum=0;
                start=i+1;
            }
        }
        return start;
        
    }
}