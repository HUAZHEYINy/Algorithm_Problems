package No_104_Maximum_Depth_of_Binary_Tree;


import Utility.TreeNode;

public class Solution {
	public static void main(String[] args){
		TreeNode root = TreeNode.Intialize_Tree();
		System.out.println(maxDepth(root));
	}

	public static int maxDepth(TreeNode root) {
        if(root == null)
        return 0;
        int left = 1, right = 1;
        if(root.left != null)
            left = maxDepth(root.left) + 1;
        if(root.right != null)
            right = maxDepth(root.right) + 1;
        return Math.max(left,right);
    }
}
