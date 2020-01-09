class MergeTwoBinaryTrees617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode mergeTree = null;
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        mergeTree = new TreeNode(t1.val + t2.val);
        mergeTree.left = mergeTrees(t1.left, t2.left);
        mergeTree.right = mergeTrees(t1.right, t2.right);
            
        return mergeTree;
    }
}