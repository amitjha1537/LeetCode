class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        comb(1, k, n, ans,new ArrayList<>());
        return ans;

        
    }
    private void comb(int ind,int k,int n,List<List<Integer>> ans,List<Integer> ds){
        if(n<0||k<0) return;
        if(n==0&&k==0){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=ind;i<=9;i++){
            ds.add(i);
            comb(i+1,k-1,n-i,ans,ds);
            ds.remove(ds.size()-1);
        }

    }
}