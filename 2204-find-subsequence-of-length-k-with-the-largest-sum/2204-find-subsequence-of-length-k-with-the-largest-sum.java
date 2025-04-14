class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> minheap=new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        for(int i=0;i<nums.length;i++){
            minheap.add(new int[]{nums[i],i});
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        List<int[]> ans=new ArrayList<>(minheap);
        ans.sort(Comparator.comparingInt(a ->a[1]));
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=ans.get(i)[0];
        }
        return result;

        
    }
}