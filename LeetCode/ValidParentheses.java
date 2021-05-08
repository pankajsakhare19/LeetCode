package src.LeetCode;

import java.util.*;


public class ValidParentheses {
	public String MakeValidParentheses(String s)
	{
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0;i<s.length();i++)
		{
			if(stack.size() == 0)
			{
				stack.push(s.charAt(i));
			}
			else if(stack.peek() == '(' && s.charAt(i) == ')')
			{
				result.append(stack.pop());
				result.append(s.charAt(i));
			}
			else 
			{
				stack.push(s.charAt(i));
			}
		}
		
		if(stack.size() != 0)
		{
			while(stack.size() !=0)
			{
				if(stack.peek() == ')')
				{
					result.append(stack.pop());
					result.insert(0, '(');
				}
				else
				{
					result.append(stack.pop());
					result.append(')');
				}
			}
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses obj = new ValidParentheses();
		//System.out.println(obj.MakeValidParentheses("()))"));
		System.out.println(obj.MakeValidParentheses(")))()()(("));
		
	}

}
