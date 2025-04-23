class Solution {
    public int minStoneSum(int[] piles, int k) {
        int n=piles.length;
        PriorityQueue<Integer> ans=new PriorityQueue<>((a,b)-> b-a);
        int sum=0;
        for(int i=0;i<n;i++){
            ans.add(piles[i]);
            sum+=piles[i];
        }
        while(k-- >0){
            int largest=ans.poll();
           int reduced=largest-largest/2;
            ans.add(reduced);
            sum-=largest/2;
        }
        return sum;
    }
}