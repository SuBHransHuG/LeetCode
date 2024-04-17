class Solution {
    private StringBuilder currentPath; 
    private String smallestPath; 

    public String smallestFromLeaf(TreeNode root) {
        currentPath = new StringBuilder();
        smallestPath = String.valueOf((char) ('z' + 1));
        depthFirstSearch(root);
        return smallestPath;
    }

    private void depthFirstSearch(TreeNode node) {
        if (node != null) {
            currentPath.append((char) ('a' + node.val));
            if (node.left == null && node.right == null) {
                String leafToRootPath = currentPath.reverse().toString();
              
                if (leafToRootPath.compareTo(smallestPath) < 0) {
                    smallestPath = leafToRootPath;
                }
              
                currentPath.reverse();
            }
          
            depthFirstSearch(node.left);
            depthFirstSearch(node.right);
          
            currentPath.deleteCharAt(currentPath.length() - 1);
        }
    }
}
