class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for (int i = left; i <= right; i++) {
            boolean isCovered = false;
        for (int j = 0; j < ranges.length; j++) {
            int[] range = ranges[j];
                 if (range[0] <= i && i <= range[1]) {
                    isCovered = true;
                    break;
                }
            }
            if (!isCovered) {
                return false;
            }
        }
        return true;
    }
}
