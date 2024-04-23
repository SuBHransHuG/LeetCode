class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> minHeightTrees = new ArrayList<>();
      
        if (n == 1) {
            minHeightTrees.add(0);
            return minHeightTrees;
        }
        List<Integer>[] adjacencyList = new List[n];
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        int[] degrees = new int[n];
        for (int[] edge : edges) {
            int nodeA = edge[0];
            int nodeB = edge[1];
          
            adjacencyList[nodeA].add(nodeB);
            adjacencyList[nodeB].add(nodeA);
          
            degrees[nodeA]++;
            degrees[nodeB]++;
        }
      
        Queue<Integer> leavesQueue = new LinkedList<>();
      
        for (int i = 0; i < n; i++) {
            if (degrees[i] == 1) {
                leavesQueue.offer(i);
            }
        }
      
        while (!leavesQueue.isEmpty()) {
            minHeightTrees.clear();
            int leavesCount = leavesQueue.size();
          
            for (int i = 0; i < leavesCount; i++) {
                int leafNode = leavesQueue.poll();
              
                minHeightTrees.add(leafNode);
              
                for (int neighbor : adjacencyList[leafNode]) {
                    degrees[neighbor]--;
                    if (degrees[neighbor] == 1) {
                        leavesQueue.offer(neighbor);
                    }
                }
            }
        }
      
        return minHeightTrees;
    }
}
