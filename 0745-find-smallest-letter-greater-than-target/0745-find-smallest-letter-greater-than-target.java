class Solution {
    public char nextGreatestLetter(char[] letters, char target) {    
        char results = letters[0];
        for(int i = 0; i < letters.length; i++){
            if(letters[i] > target){
                results = letters[i];
                break;
            }
        }
        return results;
       }
}

// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {    
//         for (char letter : letters) {
//             if (letter > target) {
//                 return letter;
//             }
//         }
//         return letters[0];
//     }
// }


















/*
int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
 
 */