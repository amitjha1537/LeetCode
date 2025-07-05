class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer> ans=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            ans.add(stones[i]);
        }
        while(ans.size()>1){
            int x=ans.poll();
            int y=ans.poll();
            ans.add(Math.abs(x-y));
        }
        return ans.isEmpty()?0:ans.poll();
        
    }
}