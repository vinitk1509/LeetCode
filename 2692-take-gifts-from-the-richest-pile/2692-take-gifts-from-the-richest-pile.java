class Solution {
    public long pickGifts(int[] gifts, int k) {
        for(int i = 0 ; i < k ; i++){
            int maxind = 0;
            for(int j = 0 ; j < gifts.length; j++){
                if(gifts[j] > gifts[maxind]){
                    maxind = j;
                }
            }
            gifts[maxind] = (int) Math.floor(Math.sqrt(gifts[maxind]));
        }
        long totalGifts = 0; for (int gift : gifts) { 
            totalGifts += gift; 
            }         
            return totalGifts;
    }
}