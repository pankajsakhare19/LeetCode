package src.LeetCode;

public class Q7 {
	public Boolean isPalindrome(int x)
	{
		int orinum=x;
		 int result = 0;
	        while(x != 0)
	        {
	        	int lastno = x % 10;
	        	int newresult = (result * 10) + lastno;
	        	if((newresult - lastno) / 10 != result)
	        	{
	        		return false;
	        	}				
	        	result = newresult;
	        	x = x / 10;
	        }
			
		if(orinum == result) 
			return true;
		return false;
	}
	public int reverse(int x) {
        int result = 0;
        while(x != 0)
        {
        	int lastno = x % 10;
        	int newresult = (result * 10) + lastno;
        	if((newresult - lastno) / 10 != result)
        	{
        		return 0;
        	}				
        	result = newresult;
        	x = x / 10;
        }
		
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q7 obj = new Q7();
		System.out.println(obj.isPalindrome(121121));
	}

}
