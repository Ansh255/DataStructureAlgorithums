class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private int maxPathSum = Integer.MIN_VALUE;
    public int traverse(TreeNode node){
        if (node == null) {
            return 0;
        }
        // Calculate the sum of the left subtree
        int leftSum = Math.max(0, traverse(node.left));
        // Calculate the sum of the right subtree
        int rightSum = Math.max(0, traverse(node.right));

        // Update the maximum path sum seen so far
        maxPathSum = Math.max(maxPathSum, node.val + leftSum + rightSum);

        // Return the maximum sum of paths ending at the current node
        return node.val + Math.max(leftSum, rightSum);
    }
    public int maxPathSum(TreeNode root) {
       traverse(root);
        return maxPathSum;
    }
}