package src.datastructure;

public class CountNoOfFullNodes {
	public static int CountFUllNodes(TreeNode root)
	{
		if(root == null)
			return 0;
		
		else if(root.left == null || root.right == null)
			return 0;
		
		else
			return 1 + CountFUllNodes(root.left) + CountFUllNodes(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode left = new TreeNode();
	    left.val = 20;
	    TreeNode right = new TreeNode();
	    right.val = 30;
	    right.left = left;
	    right.right = new TreeNode(40, null, null);
		TreeNode tree = new TreeNode(10, left, right);
		 
		System.out.println(CountFUllNodes(tree));

	}

}
