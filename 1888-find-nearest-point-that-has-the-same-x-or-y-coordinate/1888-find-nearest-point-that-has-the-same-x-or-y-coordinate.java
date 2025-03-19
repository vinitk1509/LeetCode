class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int MAX = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < points.length; i++){
            if(x == points[i][0] || y == points[i][1]){
                int distance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(distance < MAX){
                    MAX = distance;
                    index = i;
                }
            }
        }
        return index;
    }
}




/**

int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < points.length; i++){
            
                if(x == points[i][0] || y == points[i][1]){
                    int distance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                    if (distance < min){
                        min = distance;
                        index = i;

                } 
            }
        }
        return index;
 */