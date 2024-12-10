class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length;
        int n = score[0].length;
        for(int i = 0 ; i < m-1; i++){
            for(int j = 0 ; j < m-i-1; j++){
                if(score[j][k] < score[j+1][k]){
                    for(int col = 0; col < n; col++){
                        int temp = score[j][col];
                        score[j][col] = score[j+1][col];
                        score[j+1][col] = temp;
                    }
                } 
            }
        }
    // Arrays.sort(score, (a, b) -> Integer.compare(b[k], a[k])); // Descending order for kth exam scores
        
        return score;
    }
}