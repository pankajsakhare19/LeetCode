package src.datastructure;
import java.util.*;

//operator stack
public class InfixToPostFixConversion {

	//higher number higher precedence
		static int GetPrecedence(char c)
		{
			switch(c)
			{
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
			}
			
			return -1;
		}
		
		static String InfixToPostFix(String exp)
		{
			Stack<Character> charStack = new Stack<Character>();
			String output = new String("");
			
			for(int i=0;i<exp.length();i++)
			{
				//if char is operand output char
				if(Character.isLetterOrDigit(exp.charAt(i)))
				{
					output = output + exp.charAt(i);
				}
				else if(exp.charAt(i) == '(')
				{
					charStack.push('(');
				}
				else if(exp.charAt(i) == ')')
				{
					while(charStack.peek() != '(')
					{
						output = output + charStack.pop();
					}
					charStack.pop();
				}
				else //t is operator 
				{
					
					while(!charStack.isEmpty() && GetPrecedence(exp.charAt(i))<= GetPrecedence(charStack.peek()))
					{
						output += charStack.pop();
					}
					
					charStack.push(exp.charAt(i));
				}
				
			}
			
			//pop all the operator from stack until stack is empty
			 while (!charStack.isEmpty()){
		            if(charStack.peek() == '(')
		                return "Invalid Expression";
		            output += charStack.pop();
		         }
		        return output;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 String exp = "a+b*(c^d-e)^(f+g*h)-i(a+b)";
		String exp = "a+b+c";
	        System.out.println(InfixToPostFix(exp));

	}

}
