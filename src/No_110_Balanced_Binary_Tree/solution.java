package No_110_Balanced_Binary_Tree;

public class solution {

	public static void main(String[] args) {
		System.out.println(isBalanced(TreeNode.initialize()));
	}
	
	public static boolean isBalanced(TreeNode root) {
		return dfs(root) != -1;
	}
	
	public static int dfs (TreeNode root) {
		if (root == null) { return 0; }
		int leftDepth = dfs(root.left);
		int rightDepth = dfs(root.right);
		
		if (leftDepth == -1 || rightDepth == -1) {
			return -1;
		}
		if (Math.abs(leftDepth - rightDepth) <= 1) {
			return 1 + Math.max(leftDepth, rightDepth);
		}
		
		return -1;
	}

}
