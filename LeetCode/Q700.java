package src.LeetCode;

public class Q700 {
	public TreeNode searchBST(TreeNode root, int val) {
		 if (root == null)
	            return root;
		 
	     if (root.val == val)
	    	 return root;
	     else if (root.val > val)
	         return searchBST(root.left, val);
	     else if (root.val < val)
	         return searchBST(root.right, val);
	        
	     return null;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
