package No_107_Binary_Tree_Level_Order_Traversal_II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solutions {
	public static void main(String[] args){
		Solutions.levelOrderBottom(TreeNode.intialize());
		System.out.println(0);
	}
	
	public static List<List<Integer>> levelOrderBottom(TreeNode root){
		
		List<List<Integer>> parentList = new ArrayList<List<Integer>> ();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		traversalTree(root, 0, parentList);
		
		return parentList;
	}
	
	public static void traversalTree(TreeNode node, int level, List<List<Integer>> list){
		if(node == null)return;
		
		if(list.size() <= level){
			list.add(new ArrayList<Integer>());
		}
		
		list.get(level).add(node.val);
		
		traversalTree(node.left, level + 1, list);
		traversalTree(node.right, level + 1, list);
	}

}
