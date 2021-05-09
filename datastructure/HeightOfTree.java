package src.datastructure;

public class HeightOfTree {
	public static int FindHight(TreeNode root)
	{
		if(root == null)
			return 0;
		
		int lh = 1;
		int rh = 1;
		
		lh = lh + FindHight(root.left);
		rh = rh + FindHight(root.right);
		
		return lh>rh ? lh : rh;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		TreeNode left = new TreeNode();
	    left.val = 20;
	    TreeNode right = new TreeNode();
	    right.val = 30;
	    //right.left = left;
	    //right.right = new TreeNode(40, null, null);
		TreeNode tree = new TreeNode(10, left, right);
		 
		System.out.println(FindHight(tree));
	}

}
