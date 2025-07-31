class Solution {
    public boolean isPalindrome(String s) {
        String ls = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        StringBuilder sb = new StringBuilder(ls);
        sb.reverse();
        String reversed = sb.toString();

        return reversed.equals(ls);
    }
}