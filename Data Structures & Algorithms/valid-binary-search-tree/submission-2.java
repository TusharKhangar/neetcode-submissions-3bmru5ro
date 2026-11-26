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
    public boolean isValidBST(TreeNode root) {
        Long min = Long.MIN_VALUE;
        Long max = Long.MAX_VALUE;
        return validBST(root, min, max);
    }
    private boolean validBST(TreeNode root, Long min, Long max){
        if(root == null) return true;

        if(root.val <= min || root.val >= max){
            return false;
        }
        return validBST(root.left, min, (long)root.val) && validBST(root.right, (long)root.val, max);
    }
}
