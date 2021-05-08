package src.LeetCode;

import java.util.HashMap;

public class Q387 {
	
	public int firstUniqChar(String s) {
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		for(int i=0;i<n;i++)
		{
			if(count.get(s.charAt(i)) == 1)
				return i;
		}
		
		return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
