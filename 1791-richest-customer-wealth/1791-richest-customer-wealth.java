class Solution {
    public int maximumWealth(int[][] accounts) {
    int max = 0;
    
    for (int i = 0; i < accounts.length; i++) {  
        int sum = 0;// ik vaar run hon to baad rehnda ta loop ch hi hai so sum = 0 v krna har row to baad that's why it is placed here.
        for (int j = 0; j < accounts[i].length; j++) {  
            sum += accounts[i][j]; 
        if( sum > max){
            max = sum;
        }
        }
    }
    return max; 
    }
}













/*
 int max = 0;
        for(int i =0; i< accounts.length; i++){
            int  k = 0;
            for(int j=0; j< accounts[i].length; j++){
                k += accounts[i][j];
            }
            if (k > max){
                max = k;
            }
        }
        return max;
 */