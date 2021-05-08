package src.datastructure;

import java.util.Stack;


public class PostfixEvaluation {
	static int EvalExp(String exp)
	{
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<exp.length();i++)
		{
			char c = exp.charAt(i);
			
			if(Character.isDigit(c))
			{
				stack.push(c - '0');
			}
			else
			{				
				int num1 = stack.pop();
				if(stack.isEmpty())
					return -1;
				int num2 = stack.pop();
				
				switch(c)
				{
				case '+':
					stack.push(num2 + num1);
					break;
				case '-':
					stack.push(num2 - num1);
					break;
				case '/':
					stack.push(num2 / num1);
					break;
				case '*':
					stack.push(num2 * num1);
					break;
				}
				
			}
			
			
		}
		
		return stack.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "12";
        System.out.println(EvalExp(exp));


	}

}
