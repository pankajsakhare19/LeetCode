package src.LeetCode;

public class Q14 {
	
	public String longestCommonPregix2(String[] strs)
	{
		if(strs.length == 0)
			return "";
		
		for(int i = 0;i<strs[0].length();i++)
		{
			char chartomatch =  strs[0].charAt(i);
			for(int j=1;j<strs.length;j++)
			{
				if(i>= strs[j].length() ||	strs[j].charAt(i) != chartomatch)
				{
					return strs[0].substring(0, i);
				}
				
			}
		}
		
		return strs[0];
	}
	
	 public String longestCommonPrefix(String[] strs) {
		 // HERE TIME COMPLEXITY IS O(N)
		   if(strs.length ==0)
			   return "";
		 	String str1 = strs[0];
	        for(int i=1;i<strs.length;i++)
	        {
	        	while(strs[i].indexOf(str1) != 0)
	        	{
	        		str1 = str1.substring(0, str1.length() - 1);
	        	}
	        }
	     return str1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q14 obj = new Q14();
		System.out.println(obj.longestCommonPregix2(new String[] {"flower", "flow", "flight"}));
		System.out.println(obj.longestCommonPrefix(new String[] {"flower", "flow", "flight"}));

	}

}
