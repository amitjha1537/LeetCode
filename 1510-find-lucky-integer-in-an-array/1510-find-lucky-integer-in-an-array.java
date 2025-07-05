class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
      for(int nums:map.keySet()){
        if(nums==map.get(nums)){
            int temp=nums;
            ans=Math.max(ans,temp);
        }
      }
        
      
      return ans;

        
    }
}