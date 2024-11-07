class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];
        
        for (int i = 0; i < n; i++) {
            avgs[i] = -1;
        }
        
        if (2 * k + 1 > n) {
            return avgs;
        }

        long windowSum = 0;
        for (int i = 0; i < 2 * k + 1; i++) {
            windowSum += nums[i];
        }
        for (int i = k; i < n - k; i++) {
            avgs[i] = (int) (windowSum / (2 * k + 1));

            if (i + k + 1 < n) {
                windowSum = windowSum - nums[i - k] + nums[i + k + 1];
            }
        }

        return avgs;
    }
}
