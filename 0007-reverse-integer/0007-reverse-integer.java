class Solution {
    public int reverse(int x) {
        int rev=0;
        int sign=(x<0)?-1:1;
        x=Math.abs(x);
        while(x!=0){
            int remainder=x%10;
            if(rev>(Integer.MAX_VALUE-remainder)/10){
                return 0;
            }
            rev=rev*10+remainder;
            x=x/10;

        }
        return rev*sign;
    }
}