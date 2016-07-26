package No_226_Invert_Binary_Tree;

import Utility.TreeNode;

public class Solution {
	public static TreeNode invertTreeNode(TreeNode root){
		TreeNode temp;
		if(root != null){
			temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		else
			return root;
		invertTreeNode(root.left);
		invertTreeNode(root.right);
		return root;
	}

}
