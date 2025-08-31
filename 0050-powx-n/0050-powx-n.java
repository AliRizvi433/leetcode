class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        
        long N = n;
        
        if (N < 0) {
            x = 1 / x;   // flip the base
            N = -N;      // make exponent positive
        }

        while(N>0){
            if(N%2 == 1){
                res *= x;
                N--;
            }

            else{
                x *= x;
                N = N/2;
            }
        }

        return res;
    }
}