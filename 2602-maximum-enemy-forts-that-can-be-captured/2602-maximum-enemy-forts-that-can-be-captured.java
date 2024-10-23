class Solution {
    public int captureForts(int[] forts) {
        int n = forts.length;
        int maxCaptured = 0;

        for (int i = 0; i < n; i++) {
            if (forts[i] == 1) { 
                
               
                int j = i + 1;
                int count = 0;
                while (j < n && forts[j] == 0) {
                    count++;
                    j++;
                }
                if (j < n && forts[j] == -1) {
                    maxCaptured = Math.max(maxCaptured, count); 
                }
                
                j = i - 1;
                count = 0;
                while (j >= 0 && forts[j] == 0) {
                    count++;
                    j--;
                }
                if (j >= 0 && forts[j] == -1) {
                    maxCaptured = Math.max(maxCaptured, count);
                }
            }
        }

        return maxCaptured;
    }
}
