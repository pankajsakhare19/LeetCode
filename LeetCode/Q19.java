package src.LeetCode;

public class Q19 {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null)
			return head;
		ListNode oriHead = new ListNode();
		oriHead = head;
		ListNode curr = new ListNode();
		ListNode ahead = new ListNode();
		
		curr = head;
		ahead = head.next;
		
		while(n>0)
		{
			curr = ahead;
			ahead = ahead.next;
			n--;
		}
		
		if(ahead == null)
			curr.next = null;
		curr.next = ahead.next;
		
		return oriHead;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
