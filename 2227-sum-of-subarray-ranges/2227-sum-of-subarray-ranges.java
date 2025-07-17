class Solution {
    public long subArrayRanges(int[] nums) {
   
        int n=nums.length;
        long res=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<=n;i++){
            while(!stack.isEmpty()&&nums[stack.peek()]>(i==n?Integer.MIN_VALUE:nums[i])){
                int mid=stack.pop();
                int left=stack.isEmpty()?-1:stack.peek();
                int right=i;
                res -= (long) nums[mid]*(mid-left)*(right-mid);

            }
            stack.push(i);
           
        }
    
    stack.clear();
        for(int i=0;i<=n;i++){
            while(!stack.isEmpty()&&nums[stack.peek()]<(i==n?Integer.MAX_VALUE:nums[i])){
                int mid=stack.pop();
                 int right=i;
                int left=stack.isEmpty()?-1:stack.peek();
                 res+=(long) nums[mid]*(mid-left)*(right-mid);

            }
            stack.push(i);
        }
       
    
    
       return res;

        
    }
}