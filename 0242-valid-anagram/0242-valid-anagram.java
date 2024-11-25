class Solution {
    public boolean isAnagram(String s, String t) {
       
    if (s.length() != t.length()) {
            return false;
        }
        List<Character> letter_s = new ArrayList<>();
        List<Character> letter_t = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            letter_s.add(s.charAt(i));
            letter_t.add(t.charAt(i));
        }

        Collections.sort(letter_s);
        Collections.sort(letter_t);

        return letter_s.equals(letter_t);
    }

    
}