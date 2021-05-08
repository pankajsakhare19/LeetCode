package src.LeetCode;
import java.util.*;

//not completed
public class Q350 {
	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		for(int i=0, j=0;i<nums1.length&& j<nums2.length;i++,j++)
		{
			if(nums1[i] == nums2[j])
			{
				count.put(i, j);
			}
			else
			{
				count.clear();
			}
		}
		
		for(int i=0;i<count.size();i++)
		{
			
		}
		return null;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
