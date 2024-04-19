class Solution {
    public int numIslands(char[][] grid) {
        // Make a boolean array to mark visited cells.
        // Initially, all cells are unvisited.
        int ROW = grid.length;
        int COL = grid[0].length;
        boolean[][] visited = new boolean[ROW][COL];

        // Initialize count as 0 and traverse through the
        // all cells of given matrix
        int count = 0;
        for (int i = 0; i < ROW; ++i) {
            for (int j = 0; j < COL; ++j) {
                if (grid[i][j] == '1' && !visited[i][j]) { // If a cell with
                    // value 1 is not
                    // visited yet, then new island found,
                    // Visit all cells in this island and
                    // increment island count
                    DFS(grid, i, j, visited);
                    ++count;
                }
            }
        }
        return count;
    }
    
    // Depth First Search (DFS) to traverse the island
    private void DFS(char[][] grid, int i, int j, boolean[][] visited) {
        int ROW = grid.length;
        int COL = grid[0].length;
        // Directions to explore: Up, Down, Left, Right
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        // Mark current cell as visited
        visited[i][j] = true;
        
        // Explore all four directions
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            // Check if the next cell is within bounds and is a part of the island
            if (x >= 0 && x < ROW && y >= 0 && y < COL && grid[x][y] == '1' && !visited[x][y]) {
                // Recursively explore the neighboring cell
                DFS(grid, x, y, visited);
            }
        }
    }
}
