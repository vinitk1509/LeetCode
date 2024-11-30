class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long exp = n; 
        if (exp < 0) {
            x = 1 / x; 
            exp = -exp; 
        }
        // in above we are dealing with negative power. i.e. making positive exponent and base = 1/x
        // now, x*x then square then dividing exponent divided by 2
        while (exp > 0) {
            if ((exp & 1) == 1) { 
                ans *= x;
            }
            x *= x; 
            exp >>= 1; 
        }
        
        return ans;
    }
}
