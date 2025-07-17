class Solution {
    
    private String check(String nums,int k){
        Stack<Character> stack=new Stack<>();
        int n=nums.length();
        if(k==nums.length()) return "0";
        for(int i=0;i<n;i++){
            char ch=nums.charAt(i);
            while(!stack.isEmpty()&&k>0&&stack.peek()-'0'>ch-'0'){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        if(stack.isEmpty()){
            return "0";
        }
        StringBuilder res=new  StringBuilder ();
        while(!stack.isEmpty()){
            res.append(stack.pop());
           
        }
        while(res.length()!=0&&res.charAt(res.length() - 1)=='0'){
            res.deleteCharAt(res.length() - 1);
        }
        res.reverse();
        if(res.length()==0) return "0";
        return res.toString();

    }
    public String removeKdigits(String num, int k) {
        return check(num,k);
    }
}