class Solution {
    public int[] separateDigits(int[] nums) {
        int totalDigits = 0;
        for (int i = 0; i < nums.length; i++) {
            totalDigits += Integer.toString(nums[i]).length();
        }
        int[] result = new int[totalDigits];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            String numStr = Integer.toString(nums[i]); 
            for (int j = 0; j < numStr.length(); j++) {
                result[index++] = numStr.charAt(j) - '0'; 
            }
        }

        return result; 
    
    }
}