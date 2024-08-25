/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        postorderTraversalHelper(root, al);
        return al;
    }
    
    private void postorderTraversalHelper(TreeNode root, ArrayList<Integer> al) {
        if (root == null) {
            return;
        }
        postorderTraversalHelper(root.left, al);
        postorderTraversalHelper(root.right, al);
        al.add(root.val);
    }
}
