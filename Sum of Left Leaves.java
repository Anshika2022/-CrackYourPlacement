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
    private int sum = 0;
    private void sumOfLeftLeaves(TreeNode root, boolean isLeft){
        if(isLeft && root.left == null && root.right == null) {
            sum += root.val;
            return;
        }
        if(root.left != null) sumOfLeftLeaves(root.left, true);
        if(root.right != null) sumOfLeftLeaves(root.right, false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
         if(root == null) return 0;
        sumOfLeftLeaves(root, false);
        return sum;
        
    }
}
