class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr==null||arr.length==0) return new int[0];
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            minheap.add(arr[i]);
        }
        int[] ans=new int[arr.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        while(!minheap.isEmpty()){
            int curr=minheap.poll();
            if(!map.containsKey(curr)){
                map.put(curr,rank);
                 rank++;
            }
           
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);

        }

        return ans;

        
    }
}