// class Solution {
//     public String largestNumber(int[] nums) {
//      List<Integer> digitList = new ArrayList<>();

//         for (int num : nums) {
//             // Convert the integer to a string
//             String strNum = String.valueOf(num);

//             // Access each digit and store it in the list
//             for (int i = 0; i < strNum.length(); i++) {
//                 int digit = Character.getNumericValue(strNum.charAt(i));
//                 digitList.add(digit);
//             }
//         }

//         // Manually convert the list to an integer array
//         int[] digitArray = new int[digitList.size()];
//         for (int i = 0; i < digitList.size(); i++) {
//             digitArray[i] = digitList.get(i);
//         }
//         Arrays.sort(digitArray);
//         String largestNumber = "";
//         for (int j = digitArray.length - 1; j >= 0; j--) {
//             largestNumber += digitArray[j];
//         }

//         // Return the resulting string
//         return largestNumber;
//     }
// }

import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert the integers to strings
        String[] numStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numStr, (a, b) -> (b + a).compareTo(a + b));

        if (numStr[0].equals("0")) {
            return "0";
        }
        String result = "";
        for (String num : numStr) {
            result += num;
        }

        return result;
    }
}
