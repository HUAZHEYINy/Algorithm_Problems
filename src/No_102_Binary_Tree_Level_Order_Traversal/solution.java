package No_102_Binary_Tree_Level_Order_Traversal;

import java.util.*;

public class solution {

	public static void main(String[] args) {
		for (List<Integer> list : levelOrder(TreeNode.initialize())) {
			for (int i : list) {
				System.out.print(i+"  ");
			}
			System.out.println("\n");
		}
	}
	
	public static List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode> ();
		Queue<TreeNode> tempQueue = new LinkedList<TreeNode> ();
		List<List<Integer>> parentList = new ArrayList<List<Integer>>();
		List<Integer> childList = null;
		
		if (root == null) {
			return parentList;
		}
		/**
	      * 	1
	      *   2  2
	      * 3  4 3  4
	      * */
		queue.add(root);
		while (!queue.isEmpty()) {
			childList = new ArrayList<Integer>();
			tempQueue.clear();
			while (!queue.isEmpty()) {
				TreeNode temp = queue.poll();
				childList.add(temp.val);
				if (temp.left != null) { tempQueue.add(temp.left); }
				if (temp.right != null) { tempQueue.add(temp.right); }
			}
			queue.addAll(tempQueue);
			parentList.add(childList);
		}
			
		return parentList;
	}

}
