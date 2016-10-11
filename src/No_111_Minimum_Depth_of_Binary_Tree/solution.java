package No_111_Minimum_Depth_of_Binary_Tree;

public class solution {
	public static void main (String[] args) {
		TreeNode[] nodes = new TreeNode[2];
		nodes[0] = new TreeNode(1);
		nodes[1] = new TreeNode(2);
		nodes[0].left = nodes[1];
		System.out.println(minDepth(nodes[0]));
	}
	/**
	 * Initialize a tree structure.
	 * 	
	 * 			    1
	 * 			   / \
	 * 			  2	  3
	 *           / \ /
	 *          4  5 6
	 *              \
	 *               7           
	 * */
	public static int minDepth (TreeNode root) {
		if (root == null) { return 0; }
		if (root.left == null && root.right == null) { return 1; }
		if (root.left == null && root.right != null) {
			return minDepth(root.right) + 1;
		}
		if (root.left != null && root.right == null) {
			return minDepth(root.left) + 1;
		}
		
		return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
	}
}
