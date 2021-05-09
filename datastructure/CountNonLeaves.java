package src.datastructure;

public class CountNonLeaves {
	
	public static int CountNonLeaves(TreeNode root)
	{
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null)
			return 0;
		else
			return 1+ CountNonLeaves(root.left) + CountNonLeaves(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode left = new TreeNode();
	     left.val = 20;
	     TreeNode right = new TreeNode();
	     right.val = 30;
		 TreeNode tree = new TreeNode(10, left, right);
		 
		 System.out.println(CountNonLeaves(tree));

	}

}
