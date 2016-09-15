package No_107_Binary_Tree_Level_Order_Traversal_II;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {val = x;}
	
	public static TreeNode intialize(){
		TreeNode[] tree = new TreeNode[5];
			tree[0] = new TreeNode(3);
			tree[1] = new TreeNode(9);
			tree[2] = new TreeNode(20);
			tree[3] = new TreeNode(15);
			tree[4] = new TreeNode(7);
			
		tree[0].left = tree[1];
		tree[0].right = tree[2];
		tree[2].left = tree[3];
		tree[2].right = tree[4];
		
		return tree[0];
	}

}
