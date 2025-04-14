class Solution {
    int count=0;
    final int mod=(int)1e9+7;
    private void seq(int left,int right,int k,int[] arr,int[] pow){
        if(left>right) return;
        if(arr[left]+arr[right]<=k){
            count=(count+pow[right-left])%mod;
            seq(left+1,right,k,arr,pow);
        }
        else{
            seq(left,right-1,k,arr,pow);
        }
        
       
        
    }
    public int numSubseq(int[] nums, int target) {
        int[] pow= new int[nums.length+1];
        pow[0]=1;
        for(int i=1;i<pow.length;i++){
            pow[i]=(pow[i-1]*2)%mod;
        }
        Arrays.sort(nums);
          
          seq(0,nums.length-1,target,nums,pow);
          return count;
        
    }
}