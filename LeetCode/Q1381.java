package src.LeetCode;

public class Q1381 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomStack custStack = new CustomStack(3);
		custStack.push(1);custStack.push(2);
		int param_2 = custStack.pop();
		custStack.push(2);
		custStack.push(3);
		custStack.push(4);
	
		custStack.increment(5,100);
		custStack.increment(2,100);
		
		//custStack.pop();
		//custStack.pop();
		//custStack.pop();
		//custStack.pop();
		custStack.printAllElem();
		
	}

}


class CustomStack {
	
	int arr[];
	int top;
	
	public void printAllElem()
	{
		for (int i=0;i<=this.top;i++) {
			System.out.println(arr[i]);
		}
	}

    public CustomStack(int maxSize) {
    	this.top = -1;
         this.arr = new int[maxSize];
    }
    
    public void push(int x) {
    	if((top+1) == this.arr.length)
    		return;
        this.arr[++top] = x;
    }
    
    public int pop() {
        if(this.top != -1)
        {
        	return this.arr[this.top--];
        }
        return -1;
    }
    
    public void increment(int k, int val) {
    	if(top == -1)
    		return;
    	
    	int count = 0;
    	
    	if(top < k-1)
    		count = this.top+1;
    	else
    		count = k;

        	for(int i=0;i<count;i++)
        	{
        		this.arr[i] += val;
        	}
        
    }
}
