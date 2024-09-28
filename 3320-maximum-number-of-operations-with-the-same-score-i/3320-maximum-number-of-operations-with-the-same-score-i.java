// class Solution {
//     public int maxOperations(int[] nums) {
//         int count = 0;
//         int sum = 0;
//         for(int i = 0; i < nums.length; i++){
//             sum = nums[i] + nums[i+1];
//             count++;
//             i= i +2;
//             //  int index = 0;
//             //  int index1 = 1 ;
//         // Remove the element 
//         // nums = removeTheElement(nums, index); 
//         // nums = removeTheElement(nums, index1); 

//         }
       
//     }
//     return(count);
// }

class Solution {
    public int maxOperations(int[] nums) {
        
        int count = 0;
        
        int sum = nums[0] + nums[1];
        
        int i=0;
        
        while(i<nums.length-1)
        {
            if(nums[i] + nums[i+1]==sum)
            {
                count++;
                i+=2;
            }
            else{
                break;
            }
            
        }
        
        return count;
        
    }
}