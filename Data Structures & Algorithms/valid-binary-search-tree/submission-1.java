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
	return validNode(root, min, max);
    }
    private boolean validNode(TreeNode root, Long min, Long max){
	if(root == null) return true;

	//checking if the current node value is greater than the left side and lesser than the right side

	if(root.val >= max || root.val <= min){
		return false;
	}

	return validNode(root.left,min,(long) root.val) && validNode(root.right,(long) root.val,max);

    }
}
