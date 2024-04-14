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
    
    boolean isLeafNode(TreeNode node) {
        if (node == null)
            return false;
        if (node.left == null && node.right == null)
            return true;
        return false;
    }
    
    int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
        if (root != null) {
            if (isLeafNode(root.left))
                res = res + root.left.val;
            else
                res = res + sumOfLeftLeaves(root.left);

            res = res + sumOfLeftLeaves(root.right);
        }
        return res;
    }
}
