package src.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class Q496 {
	
	
	public void NearestSmallerToRight(int[] nums)
	{
		Stack<Integer> stack = new Stack<Integer>();
		Vector<Integer> v = new Vector<Integer>();
		for(int i=nums.length-1;i>=0;i--)
		{
			if(stack.size() == 0)
			{
				v.add(-1);
			}
			else if(stack.size() > 0 && stack.peek() < nums[i])
			{
				v.add(stack.peek());
			}
			else if(stack.size() > 0 && stack.peek() >= nums[i])
			{
				while(stack.size() > 0 && stack.peek() >= nums[i])
				{
					stack.pop();
				}
				if(stack.size() == 0)
				{
					v.add(-1);
				}
				else
				{
					v.add(stack.peek());
				}
			}
			
			stack.push(nums[i]);
		}
		//before this reverse the vector
		for (Integer integer : v) {
			System.out.println(integer);
		}
	}
	
	
	
	public void NearestSmallerToLeft(int[] nums)
	{
		Stack<Integer> stack = new Stack<Integer>();
		Vector<Integer> v = new Vector<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(stack.size() == 0)
			{
				v.add(-1);
			}
			else if(stack.size() > 0 && stack.peek() < nums[i])
			{
				v.add(stack.peek());
			}
			else if(stack.size() > 0 && stack.peek() >= nums[i])
			{
				while(stack.size() > 0 && stack.peek() >= nums[i])
				{
					stack.pop();
				}
				if(stack.size() == 0)
				{
					v.add(-1);
				}
				else
				{
					v.add(stack.peek());
				}
			}
			
			stack.push(nums[i]);
		}
		
		for (Integer integer : v) {
			System.out.println(integer);
		}
	}
	
	public void NearestGreaterToLeft(int[] nums)
	{
		Stack<Integer> stack = new Stack<Integer>();
		Vector<Integer> v = new  Vector<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(stack.size() == 0)
			{
				v.add(-1);
			}
			else if(stack.size() > 0 && stack.peek() > nums[i])
			{
				v.add(stack.peek());
			}
			else if(stack.size() > 0 && stack.peek() <= nums[i])
			{
				while(stack.size() > 0 && stack.peek() <= nums[i])
				{
					stack.pop();
				}
				if(stack.size() == 0)
				{
					v.add(-1);
				}
				else
				{
					v.add(stack.peek());
				}
			}
			
			stack.push(nums[i]);
		}
		
		for (Integer integer : v) {
			System.out.println(integer);
		}
	}
	
	public void findNextGreaterElement(int[] nums)
	{
		Vector<Integer> v = new Vector<Integer>();
		Stack<Integer> s = new Stack<Integer>();
		for(int i=nums.length-1;i>=0;i--)
		{
			if(s.size() == 0)
			{
				v.add(-1);
			}
			else if(s.size() > 0 && s.peek() > nums[i])
			{
				v.add(s.peek());
				//s.push(nums[i]);
			}
			else if(s.size() > 0 && s.peek() <= nums[i])
			{
				while(s.size() > 0 && s.peek() <= nums[i])
				{
					s.pop();
				}
				if(s.size() == 0)
				{
					v.add(-1);
				}
				else
				{
					v.add(s.peek());
				}
			}
			s.push(nums[i]);
		}
		
		for (Integer integer : v) {
			System.out.println(integer);
		}
	}
	
public int[] nextGreaterElement(int[] findNums, int[] nums) {
	Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
    Stack<Integer> stack = new Stack<>();
    for (int num : nums) {
        while (!stack.isEmpty() && stack.peek() < num)
            map.put(stack.pop(), num);
        stack.push(num);
    }   
    for (int i = 0; i < findNums.length; i++)
        findNums[i] = map.getOrDefault(findNums[i], -1);
    return findNums;
    }

public void printArray(int[] arr)
{
	for (int i : arr) {
	System.out.println(i);	
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q496 obj = new Q496();
		obj.NearestSmallerToRight(new int[] {4,5,2,10,8});
		//obj.NearestSmallerToLeft(new int[] {4,5,2,10,8});
		//obj.NearestGreaterToLeft(new int[] {1,3,2,4});
		//obj.findNextGreaterElement(new int[] {1,3,2,4});
		//obj.printArray(obj.nextGreaterElement(new int[] {2,4}, new int[] {1,2,3,4}));
	}

}
