package src.datastructure;

public class CountNoOfLeaves {
	
	public static int CountLeaves(TreeNode root)
	{
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null)
			return 1;
		else
			return CountLeaves(root.left) + CountLeaves(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeNode left = new TreeNode();
	     left.val = 20;
	     TreeNode right = new TreeNode();
	     right.val = 30;
	     right.left = left;
		 TreeNode tree = new TreeNode(10, null, right);
		 
		 System.out.println(CountLeaves(tree));

	}

}
