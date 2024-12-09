class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
          int totalTime = 0;
        int[] lastIndex = new int[3]; // For 'M', 'P', 'G'
        int[] prefixSum = new int[travel.length + 1]; // To store cumulative travel time

        // Precompute prefix sums for travel times
        for (int i = 1; i <= travel.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + travel[i - 1];
        }

        // Traverse garbage array to calculate total time and find last indices
        for (int i = 0; i < garbage.length; i++) {
            totalTime += garbage[i].length(); // Time to collect all garbage at this house

            // Update last indices for each type of garbage
            if (garbage[i].contains("M")) lastIndex[0] = i;
            if (garbage[i].contains("P")) lastIndex[1] = i;
            if (garbage[i].contains("G")) lastIndex[2] = i;
        }

        // Add travel times to the last house for each garbage type
        for (int i = 0; i < 3; i++) {
            totalTime += prefixSum[lastIndex[i]];
        }

        return totalTime;
    }

    
}