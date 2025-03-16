class Solution {
    public int[] searchRange(int[] nums, int target) {
       if(nums.length==0){
        return new int[]{-1,-1};
        } 
        int leftmost=-1;
        int rightmost=-1;

        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target < nums[mid]){
                end=mid-1;
                }
            else if(target>nums[mid]){
                start=mid+1;
                }
            else
            {
              //check if this found one is the leftmost target
              if(mid==0 || nums[mid-1]!=target){
                leftmost=mid;
                break;
                }
              else{
                end=mid-1;
              }              
            }
        }

        start=0;
        end=nums.length-1;
        while(start <= end)
        {
            int mid = start+(end-start)/2;
            if(target < nums[mid]){
                end=mid-1;
                }
            else if(target>nums[mid]){
                start=mid+1;
                }
            else
            {
              //check if this found one is the rightmost target
              if(mid==nums.length-1 || nums[mid+1]!=target){
                rightmost=mid;
                break;
                }
              else{
                start=mid+1;
                }              
            }
        }
    return new int[]{leftmost,rightmost};
    }
}

