class Solution {
    public boolean isPalindrome(String s) {
        // String ls = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String str = sb.toString();
        String reversed = sb.reverse().toString();

        return reversed.equals(str);
    }
}
