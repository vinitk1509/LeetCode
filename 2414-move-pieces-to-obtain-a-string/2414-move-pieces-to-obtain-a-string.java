class Solution {
    public boolean canChange(String start, String target) {
        // Step 1: Ensure the sequence of pieces matches ignoring '_'
        String startWithoutUnderscore = start.replace("_", "");
        String targetWithoutUnderscore = target.replace("_", "");
        
        if (!startWithoutUnderscore.equals(targetWithoutUnderscore)) {
            return false;
        }
        
        // Step 2: Check movement constraints
        int i = 0, j = 0;
        int n = start.length();
        
        while (i < n && j < n) {
            // Skip underscores in both strings
            while (i < n && start.charAt(i) == '_') {
                i++;
            }
            while (j < n && target.charAt(j) == '_') {
                j++;
            }
            
            // If both indices are valid, compare the pieces
            if (i < n && j < n) {
                // Check that the characters match
                if (start.charAt(i) != target.charAt(j)) {
                    return false;
                }
                // Check movement constraints
                if (start.charAt(i) == 'L' && i < j) { // 'L' cannot move to the right
                    return false;
                }
                if (start.charAt(i) == 'R' && i > j) { // 'R' cannot move to the left
                    return false;
                }
                // Move to the next piece
                i++;
                j++;
            }
        }
        
        // Ensure there are no leftover pieces in either string
        while (i < n) {
            if (start.charAt(i) != '_') {
                return false;
            }
            i++;
        }
        while (j < n) {
            if (target.charAt(j) != '_') {
                return false;
            }
            j++;
        }
        
        return true;
    }
}
