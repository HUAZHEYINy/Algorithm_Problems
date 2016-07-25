package Utility;

public class TreeNode {
	int val;
	public TreeNode left;
	public TreeNode right;
	TreeNode(int x){ val = x;}
	
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
	public static TreeNode Intialize_Tree(){
		TreeNode[] tree = new TreeNode[7];
		for(int i = 1, j = 0; i <= 7; i++, j++){
			tree[j] = new TreeNode(i);
		}
		
		tree[0].left = tree[1];
		tree[0].right = tree[2];
		tree[1].left = tree[3];
		tree[1].right = tree[4];
		tree[4].right = tree[6];
		tree[2].left = tree[5];
	
	return tree[0];
	}
	
}
