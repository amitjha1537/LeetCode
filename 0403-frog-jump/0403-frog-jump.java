class Solution {
    public boolean canCross(int[] stones) {
      HashMap<Integer,HashSet<Integer>> dp=new HashMap<>();
      for(int stone:stones){
        dp.put(stone,new HashSet<>());
      }
      dp.get(0).add(0);
      int n=stones.length;
      for(int stone:stones){
        for(int k:dp.get(stone)){
            for(int step=k-1;step<=k+1;step++){
                if(step>0&&dp.containsKey(step+stone)){
                    dp.get(stone+step).add(step);
                }
            }
        }
      }
      return !dp.get(stones[n-1]).isEmpty();



        
    }
}