class Solution {
    public int minAddToMakeValid(String s) {
        Stack<String> ans=new Stack<>();
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                ans.push("(");
            }
            else{
                if(!ans.isEmpty()){
                           ans.pop();
                }
                else{
                    count++;
                }
               
            }
        }
        return count+ans.size();
        
    }
}