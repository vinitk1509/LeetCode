class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
    //     for(int i = 0 ; i < score.length; i++){
    //         for(int j = 0 ; j < score[i].length; j++){
    //             score[i][k] 
    //         }
    //     }
    Arrays.sort(score, (a, b) -> Integer.compare(b[k], a[k])); // Descending order for kth exam scores
        
        return score;
    }
}