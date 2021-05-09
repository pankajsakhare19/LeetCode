package src.datastructure;

public class CountNoOfFullNodes {
	public static int CountFUllNodes(TreeNode root)
	{
		if(root == null)
			return 0;
		
		else if(root.left == null && root.right == null)
			return 0;
		
		else
			return CountFUllNodes(root.left) + CountFUllNodes(root.right) + ((root.left != null && root.right != null) ? 1 : 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode left = new TreeNode();
	    left.val = 20;
	    TreeNode right = new TreeNode();
	    right.val = 30;
	    right.left = new TreeNode(40, new TreeNode(50, null, null), new TreeNode(60,null,null));
		TreeNode tree = new TreeNode(10, left, right);
		 
		System.out.println(CountFUllNodes(tree));

	}

}
