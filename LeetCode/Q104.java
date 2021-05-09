package src.LeetCode;

public class Q104 {
	public int maxDepth(TreeNode root) {
		if(root == null)
			return 0;
		
		int ld = 0;
		int rd = 0;
		if(root.left != null)
		{
			ld = 1 + maxDepth(root.left);
		}
		if(root.right != null)
		{
			rd = 1 + maxDepth(root.right);
		}
		
		return ld > rd ? ld : rd;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
