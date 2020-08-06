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
class SubTreeOfAnotherTree572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(s);
        while (!queue.isEmpty()) {
            TreeNode p = queue.remove();
            if (compareNode(p, t)) return true;
            if(p.left != null) queue.add(p.left);
            if(p.right != null) queue.add(p.right);
        }
        return false;
    }

    private boolean compareNode(TreeNode t1, TreeNode t2) {
        return (t1 == null && t2 == null) 
            || t1 != null && t2 != null
            && t1.val == t2.val
            && compareNode(t1.left, t2.left)
            && compareNode(t1.right, t2.right);
    }
}