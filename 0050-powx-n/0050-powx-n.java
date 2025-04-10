class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;
         if (n < 0) {
            x = 1 / x;
            if (n == Integer.MIN_VALUE) { // Handle overflow case
                return x * myPow(x, -(n + 1));
            }
            n = -n;
        }


        double res= myPow(x,n/2);
        if(n%2==1){
            return res*res*x;
        }
        else{
            return res*res;
        }
        
    }
}