class Solution {
    public int countLargestGroup(int n) {
        int count=0;
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum= digitsum(i);
            ans.put(sum,ans.getOrDefault(sum,0)+1);
        }
        int maxsum=0;
        for(int sum:ans.values()){
            maxsum=Math.max(sum,maxsum);

        }
        for(int sum:ans.values()){
            if(maxsum==sum){
                count++;
            }
        }
        return count;
    }
       
        public int digitsum(int n){
            int sum=0;
             while(n>0){
           sum+= n%10;
           n=n/10;
        }
        return sum;
        }
        
        

        
        
    
}