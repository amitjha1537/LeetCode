class Solution {
    private void check(List<List<Integer>> ans, List<Integer> temp,int[] arr, int target,int i){
        if(i==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return ;

        }
        if(arr[i]<=target){
            temp.add(arr[i]);
            check(ans,temp,arr,target-arr[i],i);
            temp.remove(temp.size()-1);
        }
        check(ans,temp,arr,target,i+1);
        
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        check(ans,new ArrayList<>(),candidates,target,0);
       return ans;
    }
}