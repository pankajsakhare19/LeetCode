package src.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q217 {
	  public boolean containsDuplicate(int[] nums) {
		   Set<Integer> distinct = new HashSet<Integer>();
		    for(int num : nums) {
		        if(distinct.contains(num)) {
		            return true;
		        }
		        distinct.add(num);
		    }
		    return false;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
