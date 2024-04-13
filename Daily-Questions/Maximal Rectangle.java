class Solution {
    public int maximalRectangle(char[][] matrix) {
      
        int numColumns = matrix[0].length;
      
        int[] heights = new int[numColumns];
      
        int maxArea = 0;
      
        for (char[] row : matrix) {
            for (int j = 0; j < numColumns; ++j) {
                heights[j] = row[j] == '1' ? heights[j] + 1 : 0;
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
      
        return maxArea;
    }

    private int largestRectangleArea(int[] heights) {
    
        int maxArea = 0;
      
        Deque<Integer> stack = new ArrayDeque<>();
        int[] left = new int[heights.length];
      
        int[] right = new int[heights.length];
      
        Arrays.fill(right, heights.length);
      
        for (int i = 0; i < heights.length; ++i) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
          
                right[stack.pop()] = i;
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
          
            stack.push(i);
        }
      
        for (int i = 0; i < heights.length; ++i) {
            maxArea = Math.max(maxArea, heights[i] * (right[i] - left[i] - 1));
        }
      
        return maxArea;
    }
}
