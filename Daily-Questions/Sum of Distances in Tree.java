class Solution {
    private int numberOfNodes;
    private int[] distanceSum;
    private int[] subtreeSize;
    private List<Integer>[] graph;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        this.numberOfNodes = n;
        this.graph = new List[n];
        this.distanceSum = new int[n];
        this.subtreeSize = new int[n];
      
        // Initialize lists for each vertex.
        Arrays.setAll(graph, k -> new ArrayList<>());
      
        // Build the graph from the edges array.
        for (int[] edge : edges) {
            int nodeA = edge[0], nodeB = edge[1];
            graph[nodeA].add(nodeB);
            graph[nodeB].add(nodeA);
        }

        // First DFS to calculate the total distance and the size of subtrees.
        dfsPostOrder(0, -1, 0);
      
        // Second DFS to calculate the answer for all nodes based on root's answer.
        dfsPreOrder(0, -1, distanceSum[0]);

        return distanceSum;
    }

    private void dfsPostOrder(int node, int parentNode, int depth) {
        // Add the depth to the total distance for the root.
        distanceSum[0] += depth;
        subtreeSize[node] = 1;

        for (int child : graph[node]) {
            if (child != parentNode) {
                dfsPostOrder(child, node, depth + 1);
                // Update subtree size after the child's size has been determined.
                subtreeSize[node] += subtreeSize[child];
            }
        }
    }

    private void dfsPreOrder(int node, int parentNode, int totalDistance) {
        // Set the current node's distance sum.
        distanceSum[node] = totalDistance;

        for (int child : graph[node]) {
            if (child != parentNode) {
                // Calculate the new total distance for the child node.
                int childDistance = totalDistance - subtreeSize[child] + numberOfNodes - subtreeSize[child];
                dfsPreOrder(child, node, childDistance);
            }
        }
    }
}
