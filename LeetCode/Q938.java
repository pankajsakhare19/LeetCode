package src.LeetCode;

public class Q938 {
	public int sum = 0;
	
	public int rangeSumBST(TreeNode root, int low, int high) {
		if( root == null) return 0;
		
		if(root != null)
		{
			if(root.val >= low && root.val <= high)
				sum = sum + root.val;
			rangeSumBST(root.left, low, high);
			rangeSumBST(root.right, low, high);
		}
		
		return sum;
		

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode l7 = new TreeNode(18,null, null); 
		TreeNode l6 = new TreeNode(13,null, null); 
		TreeNode r3 = new TreeNode(15,l6, l7); 
		TreeNode l4 = new TreeNode(6,null, null); 
		TreeNode l3 = new TreeNode(1,null, null); 
		TreeNode r2 = new TreeNode(7,l4, null); 
		TreeNode l2 = new TreeNode(3,l3, null); 
		TreeNode l1 = new TreeNode(5,l2, r2); 
		TreeNode root = new TreeNode(10,l1, r3);
		
		Q938 obj = new Q938();
		System.out.println(obj.rangeSumBST(root, 6, 10));

	}

}
