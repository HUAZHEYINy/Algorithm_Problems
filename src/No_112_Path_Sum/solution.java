package No_112_Path_Sum;

public class solution {
	public static void main (String[] args) {
		System.out.println(hasPathSum(TreeNode.Intialize_Tree(),7));
	}
	
	public static boolean hasPathSum (TreeNode root, int sum) {
		if (root == null) { return false; }
		if (sum - root.val == 0 & root.left == null && root.right == null) {
			return true;
		}
		return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
	}

}
