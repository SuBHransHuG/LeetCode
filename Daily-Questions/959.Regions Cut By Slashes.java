class Solution {
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int size = 3 * n;  
        int[][] expandedGrid = new int[size][size];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char c = grid[i].charAt(j);
                if (c == '/') {
                    expandedGrid[i * 3][j * 3 + 2] = 1;
                    expandedGrid[i * 3 + 1][j * 3 + 1] = 1;
                    expandedGrid[i * 3 + 2][j * 3] = 1;
                } else if (c == '\\') {
                    expandedGrid[i * 3][j * 3] = 1;
                    expandedGrid[i * 3 + 1][j * 3 + 1] = 1;
                    expandedGrid[i * 3 + 2][j * 3 + 2] = 1;
                }
            }
        }
        
        int regions = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (expandedGrid[i][j] == 0) {
                    dfs(expandedGrid, i, j);
                    regions++;
                }
            }
        }
        
        return regions;
    }

        private void dfs(int[][] grid, int i, int j) {
        int n = grid.length;
        if (i < 0 || i >= n || j < 0 || j >= n || grid[i][j] != 0) {
            return;
        }
        grid[i][j] = 1;  
        
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
}
}
