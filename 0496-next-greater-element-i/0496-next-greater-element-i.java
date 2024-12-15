class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        // Iterate through each element in nums1
        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            int nextGreater = -1;

            // Find the position of target in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == target) {
                    // Search for the next greater element to the right
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            nextGreater = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }

            // Store the result for nums1[i]
            result[i] = nextGreater;
        }

        return result;
    }
}
