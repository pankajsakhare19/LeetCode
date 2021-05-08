package src.LeetCode;

import java.util.Stack;
import java.util.Vector;

public class StockSpanProblem {
	
	public void FindStockSpan(int[] nums)
	{
		Vector<Integer> vector = new Vector<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<nums.length; i++)
		{
			if(stack.size()==0)
			{
				vector.add(1);
			}
			else if(stack.size()>0 && nums[stack.peek()]>nums[i])
			{
				vector.add(1);
			}
			else if(stack.size()>0 && nums[stack.peek()] <= nums[i])
			{
				//int count = 1;
				while(stack.size() > 0 && nums[stack.peek()] <= nums[i])
				{
					stack.pop();					
				}
				if(stack.size() == 0)
				{
					vector.add(i+1);
				}
				else
				{
					vector.add(i - stack.peek());
				}
			}			
			stack.push(i);
		}
		
		
		for (Integer integer : vector) {
			System.out.println(integer);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockSpanProblem obj = new StockSpanProblem();
		//obj.FindStockSpan(new int[] {100,80,60,70,60,75,85});
		//obj.FindStockSpan(new int[] {10,20,30,40,50,60});
		obj.FindStockSpan(new int[] {60,50,40,30,20,10});
	}

}
