package src.LeetCode;
import java.util.*;


public class MaximumAreaHistogram {
	
	public int FindMaxAreaHistogram(int[] arr)
	{
		Stack<Integer> stack = new Stack<Integer>();
		Vector<Integer> res = new Vector<Integer>();
		Vector<Integer> vector = new Vector<Integer>();
		Vector<Integer> rightV = new Vector<Integer>();
		//for finding nearest smallest element to left
		for(int i=0;i<arr.length;i++)
		{
			if(stack.size() == 0)
			{
				vector.add(-1);
			}
			else if(stack.size() > 0 && arr[stack.peek()] < arr[i])
			{
				vector.add(i-1);
			}
			else if(stack.size() > 0 && arr[stack.peek()] >= arr[i])
			{			
				while(stack.size() > 0 && arr[stack.peek()] >= arr[i])
				{
					stack.pop();
				}
				if(stack.size() == 0)
				{
					vector.add(-1);
				}
				else
				{
					vector.add(stack.peek());
				}
			}
			stack.push(i);
		}
		
		stack.removeAllElements();
		for(int i=arr.length-1;i>=0;i--)
		{
			if(stack.size() == 0)
			{
				rightV.add(arr.length);
			}
			else if(stack.size() > 0 && arr[stack.peek()] < arr[i])
			{
				rightV.add(stack.peek());
			}
			else if(stack.size() > 0 && arr[stack.peek()] >= arr[i])
			{
				while(stack.size() > 0 && arr[stack.peek()] >= arr[i])
				{
					stack.pop();
				}
				if(stack.size() == 0)
				{
					rightV.add(arr.length);
				}
				else
				{
					rightV.add(stack.peek());
				}
			}
			
			stack.push(i);
		}
		
		
		System.out.println();
//		for(int i=0; i<arr.length;i++)
		for(int i=0,j=arr.length-1; i<arr.length && j >= 0;i++,j--)
		{
			res.add((rightV.elementAt(j)-vector.elementAt(i))-1);
		}
		
		
		
		for (Integer integer : res) {
			System.out.print(integer+"  ") ;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = arr[i] * res.elementAt(i);
		}
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		return 0				;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumAreaHistogram obj = new MaximumAreaHistogram();
	    obj.FindMaxAreaHistogram(new int[] {6,2,5,4,5,1,6});
		//obj.FindMaxAreaHistogram(new int[] {40,30,20,10,60,50,40,30});
	}

}
