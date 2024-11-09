class Solution {
    public int rob(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        
        for (int num = 0; num < nums.length; num++) {
            int temp = sum2;
            sum2 = Math.max(sum1 + nums[num], sum2);
            sum1 = temp;
        }
        
        return sum2;
    }
}
