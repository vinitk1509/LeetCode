import java.util.ArrayList;

class Solution {
    public int[] findErrorNums(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        // Arrays.sort(nums);
        int i =0;
        int n = nums.length;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
            int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
        } else {
            i++;
    }
    }
        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
                ans.add(index + 1);
                
            }
        }
       
        int[] result = new int[ans.size()];
        for ( i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        
        return result; 
    }
}
