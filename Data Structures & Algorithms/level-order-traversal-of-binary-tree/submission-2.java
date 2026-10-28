class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
	if(root == null) return new ArrayList<>();
	List<List<Integer>> outerlist = new ArrayList<>();
	Queue<TreeNode> queue = new LinkedList();
	queue.add(root);
	while(!queue.isEmpty()){
		int size = queue.size();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < size; i++){
			TreeNode temp = queue.poll();
			list.add(temp.val);
			if(temp.left != null){ queue.offer(temp.left);}
			if(temp.right != null){ queue.offer(temp.right);}
		}
		outerlist.add(list);
	}
	return outerlist;
    }
}