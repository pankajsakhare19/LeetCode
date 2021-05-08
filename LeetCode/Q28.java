package src.LeetCode;

public class Q28 {
	
	public int strStr(String haystack, String needle) {
		int result = -1;
		
		for(int i=0;i<haystack.length();i++)
		{
			int j=0;
			while(haystack.charAt(i) == needle.charAt(j))
			{
				j++;
				i++;
				
			}
		}
		
		return result;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
