class Solution {
    public String[] reorderLogFiles(String[] logs) {
        // Separate the logs into two lists
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();
        
        for (String log : logs) {
            // Identify the type of log
            String[] parts = log.split(" ", 2);
            if (Character.isDigit(parts[1].charAt(0))) {
                digitLogs.add(log); // Add to digit logs if the content starts with a digit
            } else {
                letterLogs.add(log); // Add to letter logs otherwise
            }
        }

        // Sort the letter logs based on the rules
        letterLogs.sort((log1, log2) -> {
            String[] parts1 = log1.split(" ", 2);
            String[] parts2 = log2.split(" ", 2);
            int contentComparison = parts1[1].compareTo(parts2[1]);
            if (contentComparison == 0) {
                return parts1[0].compareTo(parts2[0]); // Compare identifiers if contents are the same
            }
            return contentComparison; // Otherwise, compare contents
        });

        // Combine letter logs and digit logs
        List<String> result = new ArrayList<>(letterLogs);
        result.addAll(digitLogs);

        // Convert the result to an array
        return result.toArray(new String[0]);
    }

}
