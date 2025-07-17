class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        int MOD=1_000_000_007;
        int[] prev=new int[arr.length];
        int[] next=new int[arr.length];
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&& arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            prev[i]=stack.isEmpty()?i+1:i-stack.peek();
            stack.push(i);
        }
        stack.clear();
        
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&& arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            next[i]=stack.isEmpty()?n-i:stack.peek()-i;
            stack.push(i);
        }
        long sum=0;
        for(int i=0;i<n;i++){
             sum = (sum + ((long) arr[i] * prev[i] * next[i]) % MOD) % MOD;
        }
        return (int) sum;

        
    }
}