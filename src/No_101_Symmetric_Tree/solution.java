package No_101_Symmetric_Tree;

import java.util.*;

public class solution {

	public static void main(String[] args) {
		System.out.println(isSymmetric(TreeNode.initialize()));
	}
	
	public static boolean isSymmetric(TreeNode root) {
		/**
		 *   1
		 *   2 2 
		 * 
		 * 
		 * */
		if (root == null) {
			return true;
		}
		
		if ( bfs(root.left, root.right)) {
			return true;
		}
		
		return false;
		
	}
	
	public static boolean bfs (TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		
		if (left == null || right == null) {
			return false;
		}
		
		if (left.val != right.val) {
			return false;
		}
		
		return bfs(left.left, right.right) && bfs(left.right, right.left);
		
	}

}
