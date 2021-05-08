package src.LeetCode;
import java.util.*;
public class Q1769 {
	
	public int[] minOperations(String boxes) {
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder s = new StringBuilder();
        for (int i=0;i<boxes.length();i++) {
        	if(boxes.charAt(i) == '1')
        	{
        		stack.push(i);
        	}
		}
        
        for(int i=0;i<boxes.length();i++)
        {
        	
        }
        
		
		return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1769 obj = new Q1769();
		obj.minOperations("110");
	}

}
