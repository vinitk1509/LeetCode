class SubrectangleQueries {
    private int[][] rectangle; 

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = new int[rectangle.length][rectangle[0].length];
        for (int i = 0; i < rectangle.length; i++) {
            System.arraycopy(rectangle[i], 0, this.rectangle[i], 0, rectangle[i].length);
        }
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue; 
            }
        }
    }
    
    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}

/**
 * Example usage:
 * 
 * int[][] rectangle = {
 *     {1, 2, 1},
 *     {4, 3, 4},
 *     {3, 2, 1},
 *     {1, 1, 1}
 * };
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(1, 1, 2, 2, 5);
 * int value = obj.getValue(1, 1); // Outputs 5
 */
