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
    public int goodNodes(TreeNode root) {
	if(root == null) return 0;
	int result = goodNode(root, root.val);
	return result;
    }
    private int goodNode(TreeNode node, int maxSoFar){
	if(node == null) return 0;
		
	boolean good = node.val >= maxSoFar;

	int newMax = Math.max(maxSoFar, node.val);

	int left = goodNode(node.left, newMax);
	int right = goodNode(node.right, newMax);

	return left + right + (good?1:0);
    }
    
}


