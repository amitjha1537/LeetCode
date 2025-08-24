class Solution {
    public int numberOfSubstrings(String s) {
        return check(s);
    }
    private int check(String s){
        int count=0;
        int[]seen=new int[3];
        Arrays.fill(seen,-1);
        for(int i=0;i<s.length();i++){
            seen[s.charAt(i)-'a']=i;
            count=count+(1+Math.min(seen[0],Math.min(seen[1],seen[2])));
        }
        return count;
    }
}