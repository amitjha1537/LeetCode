class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[nums.length];
        int n=nums.length;
        for(int i=2*n-1;i>=0;i--){
            int curr=nums[i%n];
            while(!stack.isEmpty()&&stack.peek()<=curr){
                stack.pop();
            }
            ans[i%n]=(stack.isEmpty()?-1:stack.peek());
            stack.push(curr);
        }
        return ans;
    }
}