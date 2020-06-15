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
class MinimumAbsolutDiffBST530 {
    public int getMinimumDifference(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            list.add(new Integer(node.val));
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        int[] array = list.stream().mapToInt(i -> i.intValue()).toArray();
        Arrays.sort(array);
        int min = array[1] - array[0];
        for(int i = 2; i < array.length; i++){
            min = Math.min(min, array[i] - array[i - 1]);
        }
        return min;
    }
}