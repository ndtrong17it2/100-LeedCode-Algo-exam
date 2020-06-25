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
class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null) return result;
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            List<Integer> subResult = new ArrayList<Integer>();
            while(count > 0){
                TreeNode current = queue.remove();
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
                subResult.add(new Integer(current.val));
                count--;
            }
            result.addFirst(subResult);
        }
        return result;
    }
}