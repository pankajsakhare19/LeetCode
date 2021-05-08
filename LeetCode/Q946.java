package src.LeetCode;

public class Q946 {
	
public boolean validateStackSequences(int[] pushed, int[] popped) {

		int arr[] = new int[pushed.length];
		int top = -1;
		int n = 0;
	
        for(int i=0;i<pushed.length;i++)
        {
        	arr[++top] = pushed[i];
        	while(top != -1 && popped[n] == arr[top] && n < pushed.length)
        		{
        		n +=1;
        		top = top -1;
        		}
        }

        return top == -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q946 obj = new Q946();
		System.out.println(obj.validateStackSequences(new int[] {1,2,3,4,5},new int[] {5,4,3,2,1}));
	}

}
