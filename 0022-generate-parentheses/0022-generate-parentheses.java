class Solution {
    private List<String> check(List<String> ans, String current,int open, int close, int max){
        if(current.length()==2*max){
            ans.add(current);

        }
        if(open<max){
            check(ans,current+"(",open+1,close,max);
        }
        if(close<open){
            check(ans,current+")",open,close+1,max);
        }
        return ans;
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        return check(ans,"",0,0,n);
        
    }
}