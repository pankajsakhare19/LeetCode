package src.LeetCode;

public class Q921 {
	
    public int minAddToMakeValid(String S) {
    	char arr[] = new char[S.length()];
    	int top = -1;
    	int count = 0;
    	
    	for(int i=0;i<S.length();i++)
    	{
    		if(top == -1 && S.charAt(i) != ')')
    		{
    			arr[++top] = S.charAt(i);
    		}
    		else if(top == -1 && S.charAt(i) == ')')
    		{
    			count += 1;
    		}
    		else if(S.charAt(i) == ')')
    		{
    			if(arr[top] != '(')
    			{
    				count += 1;
    			}
    			if(arr[top] == '(')
    			{
    				top -= 1;
    			}    			
    		}
    		else if(S.charAt(i) == '(')
    		{
    			arr[++top] = S.charAt(i);
    		}
    	}
     
    	return count + top + 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q921 obj = new Q921();
		System.out.println(obj.minAddToMakeValid("()))(("));
	}

}
