class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
         Queue<TreeNode> q = new LinkedList<>();
        if (depth == 1) {
            TreeNode rt = new TreeNode(val);
            rt.left = root;
            return rt;
        }
        int c = 1;
        q.offer(root);
        while (!q.isEmpty() && c < depth) {
            int a = q.size();
            c++;
            for (int i = 0; i < a; i++) {
                TreeNode k = q.poll();
                if (c == depth) {
                    if (k.left != null) {
                        TreeNode tm = new TreeNode(val);
                        TreeNode t = k.left;
                        k.left = tm;
                        tm.left = t;
                    }
                    else {
                        TreeNode tm = new TreeNode(val);
                        k.left = tm;
                    }
 
                    if (k.right != null) {
                        TreeNode tm = new TreeNode(val);
                        TreeNode t = k.right;
                        k.right = tm;
                        tm.right = t;
                    }
                    else {
                        TreeNode tm = new TreeNode(val);
                        k.right = tm;
                    }
                }
                else {
                    if (k.left != null)
                        q.offer(k.left);
                    if (k.right != null)
                        q.offer(k.right);
                }
            }
        }
        return root;
    }
}
