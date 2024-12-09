// class Solution {
//     public int garbageCollection(String[] garbage, int[] travel) {
//           int totalTime = 0;
//         int[] lastIndex = new int[3]; // For 'M', 'P', 'G'
//         int[] prefixSum = new int[travel.length + 1]; // To store cumulative travel time

//         // Precompute prefix sums for travel times
//         for (int i = 1; i <= travel.length; i++) {
//             prefixSum[i] = prefixSum[i - 1] + travel[i - 1];
//         }

//         // Traverse garbage array to calculate total time and find last indices
//         for (int i = 0; i < garbage.length; i++) {
//             totalTime += garbage[i].length(); // Time to collect all garbage at this house

//             // Update last indices for each type of garbage
//             if (garbage[i].contains("M")) lastIndex[0] = i;
//             if (garbage[i].contains("P")) lastIndex[1] = i;
//             if (garbage[i].contains("G")) lastIndex[2] = i;
//         }

//         // Add travel times to the last house for each garbage type
//         for (int i = 0; i < 3; i++) {
//             totalTime += prefixSum[lastIndex[i]];
//         }

//         return totalTime;
//     }

    
// }













class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        
        int n =garbage.length;
        int gIndex=0, mIndex=0, pIndex = 0;

        //To find the last occurence of 'G' garbage
        for(int i=n-1;i>=0;i--){
            if(garbage[i].contains("G")){
                gIndex= i;
                break;
            }
        }

         //To find the last occurence of 'P' garbage
        for(int i=n-1;i>=0;i--){
            if(garbage[i].contains("P")){
                pIndex= i;
                break;
            }
        }

         //To find the last occurence of 'M' garbage
        for(int i=n-1;i>=0;i--){
            if(garbage[i].contains("M")){
                mIndex= i;
                break;
            }
        }

        //To find the distance between 0th index to the required index
        for(int i=1;i<travel.length;i++){
            travel[i] += travel[i-1];
        }

        int ans=0;
        //Travel time
        if(gIndex != 0){
            ans += travel[gIndex - 1];
        }
        if(pIndex != 0){
            ans += travel[pIndex - 1];
        }
        if(mIndex != 0){
            ans += travel[mIndex - 1];
        }

        //pick time
        for(int i=0;i<n;i++){
            ans += garbage[i].length();
        }

        return ans;

    }
}