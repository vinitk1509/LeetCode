// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         int i = 0;
//         ArrayList<Integer> sol = new ArrayList<>();
//         while(i < nums.length){
//             if(nums[i] != i+1){
//                 int correct = nums[i] - 1;
//                     if(nums[i] != nums[correct]){
//                         int temp = nums[i];
//                         nums[i] = nums[correct];
//                         nums[correct] = temp; 
//                     } else{
//                         sol.add(nums[i]);
//                     }
//             } else{
//                 i++;
//             }
//         }
//     return sol;
//     }
// }

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        ArrayList<Integer> sol = new ArrayList<>();
        while (i < nums.length) {
             
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp; 
                } else {
                     i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                sol.add(nums[index]);
            }
        }
        return sol;
    }
}
