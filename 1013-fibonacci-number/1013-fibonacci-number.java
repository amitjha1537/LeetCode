class Solution {
    private int f(int n,Map<Integer,Integer> memo){
        if(n<=1) return n;
        if(memo.containsKey(n)){
            return memo.get(n);
        }
      int result= f(n-1,memo)+f(n-2,memo);
    memo.put(n,result);
        return result;

    }
    public int fib(int n) {
        HashMap<Integer,Integer> memo=new HashMap<>();
        return f(n,memo);
        
    }
}