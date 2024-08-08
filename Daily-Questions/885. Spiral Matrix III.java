class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; 
        int dir = 0; 
        int steps = 1; 
        int index = 0;
        
        result[index++] = new int[]{rStart, cStart};

        while (index < rows * cols) {
            for (int i = 0; i < 2; i++) { 
                for (int j = 0; j < steps; j++) {
                    rStart += directions[dir][0];
                    cStart += directions[dir][1];
                    
                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                        result[index++] = new int[]{rStart, cStart};
                    }
                }
                dir = (dir + 1) % 4; 
            }
            steps++; 
        }
        
        return result;
    }
}
