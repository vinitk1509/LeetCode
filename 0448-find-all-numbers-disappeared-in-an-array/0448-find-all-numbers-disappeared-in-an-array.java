
import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1; // Correct index of nums[i]
            
            // Ensure within valid range and not already at correct position
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Collect missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {

//   int i = 0;
//         while (i < nums.length){
//             int correct = nums[i] - 1;
//             if (nums[i] != nums[correct]){
//                 swap(nums, i, correct);
//             } else {
//                 i++;
//             }
//         }
//         List <Integer> ans = new ArrayList<>();
//         for(int index = 0; index < nums.length; index++){
//             if(nums[index] != index+1){
//                 ans. add(index + 1);
//             }
//         }
//         return ans;
//     }
    
//     static void swap (int[] nums, int first, int second){
//         int temp = nums[first];
//         nums[first] = nums[second];
//         nums[second] = temp;
//     }

// }
// ---------------------------completely wrong------------------------------------ 
 
//        Arrays.sort(nums);
//        List<Integer> li = new ArrayList<>();
//        for(int i = 0; i < nums.length; i++){
//         if(nums[i] != i+1){
//             li.add(i+1);
//        }
//        return li;
//     }
// }