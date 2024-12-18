class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = prices[i]; // Start with the original price
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) { // Found the first valid discount
                    result[i] = prices[i] - prices[j];
                    break; // Exit the inner loop once a discount is applied
                }
            }
        }

        return result;
    }
}
