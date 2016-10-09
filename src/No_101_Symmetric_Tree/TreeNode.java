package No_101_Symmetric_Tree;

public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
     
     /**
      * 	1
      *   2  2
      * 3  4 3  4
      * */
     public static TreeNode initialize () {
    	 TreeNode[] nodes = new TreeNode[7];
    	 
    	 nodes[0] = new TreeNode(1);
    	 nodes[1] = new TreeNode(2);
    	 nodes[2] = new TreeNode(2);
    	 nodes[3] = new TreeNode(3);
    	 nodes[4] = new TreeNode(4);
    	 nodes[5] = new TreeNode(4);
    	 nodes[6] = new TreeNode(3);
    	 
    	 nodes[0].left = nodes[1];
    	 nodes[0].right = nodes[2];
    	 nodes[1].left = nodes[3];
    	 nodes[1].right = nodes[4];
    	 nodes[2].left = nodes[5];
    	 nodes[2].right = nodes[6];
    	 
    	 return nodes[0];
     }
}