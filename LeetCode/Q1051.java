package src.LeetCode;

import java.util.Arrays;


public class Q1051 {
		
    public int heightChecker(int[] heights) {
    	int []arr = new int[heights.length];
    	int count = 0;
    	 for (int i =0;i<heights.length;i++) {
    		arr[i] = heights[i];
 		}
         Arrays.sort(arr);    
    	 for (int i =0;i<heights.length;i++) {
     		if(heights[i]!=arr[i]) count++;
  		}
    	
    	 	return count;
    }
    
    public String removeOuterParentheses(String S) {
        StringBuilder s = new StringBuilder();
        int opened = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) s.append(c);
            if (c == ')' && opened-- > 1) s.append(c);
        }
        return s.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1051 obj = new Q1051();
		System.out.println(obj.heightChecker(new int[] {1,4,3,2,6}));
	}

}
