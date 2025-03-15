class Solution {
    public int findNumbers(int[] nums) {
         int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) {
                count++;
            }
        }
        return count;
    }

      static boolean even(int i){
        String s = Integer.toString(i);
        if (s.length()%2==0){
            return true;
        }
        else {
            return false;

        }

      }
}

   





// ---------------------------------------REPEAT--------------------------------------------
/*
int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            String str = String.valueOf(nums[i]); // Correct
            int len = str.length();
            if(len%2 ==0){
                count++;
            }
        }
        return count;
 */












  //  int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     String s = Integer.toString(nums[i]);
        //     if (s.length()%2==0) {
        //         count++;
        //     }
        // }
        // return count;

        // }
    // }
    //     int count = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (even(nums[i])) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    // static boolean even(int i){
    //     String s = Integer.toString(i);
    //     if (s.length()%2==0){
    //         return true;
    //     }
    //     else {
    //         return false;

    //     }
