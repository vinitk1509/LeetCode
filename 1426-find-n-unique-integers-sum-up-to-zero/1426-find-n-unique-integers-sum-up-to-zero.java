class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 1; i <= n / 2; i++) {
            result[i - 1] = -i;
            result[n - i] = i;
        }
                if (n % 2 != 0) {
            result[n / 2] = 0;
        }
        
        return result;
    }
}
