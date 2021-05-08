package src.LeetCode;
import java.util.*;
public class Q136 {
	
	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
		
		for (int i : nums) {
			hashtable.put(i, hashtable.getOrDefault(i, 0)+1);
		}
		
		for (int i : nums) {
			if(hashtable.get(i) == 1)
				return i;
		}
		
		return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
