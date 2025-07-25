class Solution {
    private HashMap<String,Boolean> memo=new HashMap<>();

    private boolean isSubSeq(String s, String t){
        if(memo.containsKey(s)){
            return memo.get(s);
        }
        boolean result=check(s,t,s.length()-1,t.length()-1);
        memo.put(s,result);

        return result;
    }
    private boolean check(String s, String t, int i, int j){
        if(i<0) return true;
        if(j<0) return false;
        if(s.charAt(i)==t.charAt(j)){
            return check(s, t, i-1,j-1);
        }
        else{
            return check(s,t,i,j-1);
        }
    }
    public int numMatchingSubseq(String s, String[] words) {
        int count=0;
        for(String word:words){
            if(isSubSeq(word,s)==true){
                count++;

            }
        }
        return count;
        
    }
}