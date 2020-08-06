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
class SecondMinimumNodeBT671 {
    public int findSecondMinimumValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Set<Integer> sets = new TreeSet<Integer>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.remove();
            sets.add(new Integer(current.val));
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }
        List<Integer> lst = new ArrayList<Integer>(sets);
        if(lst.size() > 1) return lst.get(1).intValue();
        return -1;
    }
}