class Solution {
    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10;      
        }
        return sum;
    }

    public int minElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sumOfDigits(nums[i]);
        }

        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
    }
}
