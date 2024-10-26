class Solution {
    public int maximumDifference(int[] nums) {
        int diff = -1; 
        int minElement = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minElement && (nums[i] - minElement) > diff) {
                diff = nums[i] - minElement;
            } else if (nums[i] < minElement) {
                minElement = nums[i];
            }
        }

        return diff;
    }
}