package src.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Q1 {
	
	public int[] twoSum(int[] nums, int target) {
        
		 Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (map.containsKey(complement)) {
	                return new int[] { map.get(complement), i };
	            }
	            map.put(nums[i], i);
	        }

	     //   
//        for(int i=0;i<nums.length;i++)
//        {
//        	for(int j=1;j<nums.length;j++)
//        	{
//            	if(nums[i] + nums[j] == target) {
//            		return new int[] {i,j};
//            	}
//        	}	
//        }
		
		return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 obj = new Q1();
		int [] res = new int[2];
		res = obj.twoSum(new int[]{1,5,5,4}, 10);
		for(int i=0; i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

}
