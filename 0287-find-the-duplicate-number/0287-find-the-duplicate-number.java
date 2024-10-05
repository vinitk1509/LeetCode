class Solution {
    public int findDuplicate(int[] nums) {
    int i = 0;
    while(i < nums.length){
        if(nums[i] != i+1){
        int correct = nums[i] - 1;
        if(nums[i] != nums[correct]){
            int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
        } else {
            return nums[i];
        }
        } else{
            i++;
    }
    }
        return -1;
}
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    //     int n = nums.length;
    //     for(int i = 0; i < n-1; i++){
    //         for(int j = i+1; j < n; j++){
    //            if(nums[i] == nums[j]){
    //             return nums[i];
    //            }
    //         }
    //     }
    // return -1;
    // Arrays.sort(nums);
    // for(int i=1;i<nums.length;i++){
    //     if(nums[i]==nums[i-1]){
    //         return nums[i];
    //     }
    // }
    //     return -1;