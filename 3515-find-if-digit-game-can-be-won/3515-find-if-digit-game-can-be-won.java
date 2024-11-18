class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int num : nums) {
            if (num >= 1 && num <= 9) {
                singleDigitSum += num;
            } else if (num >= 10 && num <= 99) {
                doubleDigitSum += num;
            }
        }

        return singleDigitSum > doubleDigitSum || doubleDigitSum > singleDigitSum;
    }
}
