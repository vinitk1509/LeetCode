public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            
            if (digits[i] < 10) {
                return digits;
            }
            
            digits[i] = 0;
        }
       
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;  // Set the most significant digit to 1
        return newNumber;
    }
}