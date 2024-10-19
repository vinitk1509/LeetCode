import java.util.Arrays;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // Sort the nums array
        Arrays.sort(nums);
        
        // Array to store the two sneaky numbers
        int[] result = new int[2];
        int index = 0;
        
        // Traverse the sorted array and find the duplicates
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                result[index++] = nums[i];  // Found a sneaky number
                if (index == 2) {
                    break;  // Stop once we've found both sneaky numbers
                }
            }
        }
        
        return result;
    }
}
