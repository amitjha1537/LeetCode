class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<n;i++){
            int comp=target-nums[i];
            if(ans.containsKey(comp)){
                return new int[]{
                    ans.get(comp),i
                };

            }
            ans.put(nums[i],i);
        }
        return new int[2];
    }
}