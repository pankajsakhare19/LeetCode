package src.datastructure;

public class TreeTraversal {
	
	public static void Inorder(TreeNode t)
	{
		if(t != null)
		{
			Inorder(t.left);
			System.out.println(t.val);
			Inorder(t.right);
		}
	}
	
	public static void PreOrder(TreeNode t)
	{
		if(t != null)
		{
			System.out.println(t.val);
			PreOrder(t.left);
			PreOrder(t.right);
		}
	}
	
	public static void PostOrder(TreeNode t)
	{
		if(t != null)
		{			
			PostOrder(t.left);
			PostOrder(t.right);
			System.out.println(t.val);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     TreeNode left = new TreeNode();
	     left.val = 20;
	     TreeNode right = new TreeNode();
	     right.val = 30;
		 TreeNode tree = new TreeNode(10, left, right);
		 
		 //Inorder(tree);
		 //PreOrder(tree);
		 PostOrder(tree);

	}

}
