class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;                                                    // Minimum possible penalty
        int right = Integer.MIN_VALUE;                                    // Maximum penalty is the largest bag size
        
                                                                            // Find the largest bag size
        for (int num : nums) {
            right = Math.max(right, num);
        }

        int result = right;
        
        // Binary search for the minimum penalty
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canDivide(nums, mid, maxOperations)) {
                result = mid; // Update result and try for a smaller penalty
                right = mid - 1;
            } else {
                left = mid + 1; // Try for a larger penalty
            }
        }

        return result;
    }

    // Helper function to check if we can divide bags to have maxSize ≤ penalty
    private boolean canDivide(int[] nums, int penalty, int maxOperations) {
        int operations = 0;
        
        for (int num : nums) {
            // Calculate the number of operations needed for this bag
            // If num <= penalty, no operation is needed; otherwise, divide
            operations += (num - 1) / penalty;
        }
        
        return operations <= maxOperations;
    }
}
