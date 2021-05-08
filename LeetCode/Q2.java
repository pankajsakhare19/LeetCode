package src.LeetCode;


public class Q2 {	 

	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	         int num1 = 0;
	    	while(l1 != null)
	    	{
	    		System.out.println(l1.val);
	    		num1 = num1 * 10 + l1.val;
	    		l1=l1.next;
	    	}
	    	System.out.println(num1);
	    	return null;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ListNode l1 = new ListNode(3,null);
			ListNode l2 = new ListNode(3, l1);
			ListNode l3 = new ListNode(1, l2);
			
			Q2 obj = new Q2();
			obj.addTwoNumbers(l3, null);
			
	}

}
