package src.datastructure;

public class CountNoOfNodes {
	
	public static int CountNodes(TreeNode root)
	{
		if(root == null)
			return 0;
		
		int l = CountNodes(root.left);
		int r = CountNodes(root.right);
		return 1+l+r;
		
		//below one line is also same
		//return 1+ CountNodes(root.left) + CountNodes(root.right);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeNode left = new TreeNode();
	     left.val = 20;
	     TreeNode right = new TreeNode();
	     right.val = 30;
		 TreeNode tree = new TreeNode(10, left, right);
		 
		 System.out.println(CountNodes(tree));

	}

}
