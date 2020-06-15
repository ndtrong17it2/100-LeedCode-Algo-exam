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
class TwoSumIV653 {
    public boolean findTarget(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> sets = new ArrayList<Integer>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.remove();
            if(sets.contains(new Integer(k - currentNode.val))){
                return true;
            }
            sets.add(new Integer(currentNode.val));
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        
        return false;
    }
}