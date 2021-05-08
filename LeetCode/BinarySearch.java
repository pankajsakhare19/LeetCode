package src.LeetCode;

public class BinarySearch {
	
	public static int binarySearch(int nums[], int no, int left, int right)
	{
		if(right >= left)
		{
			int mid = left + (right - left)/2;
			if(nums[mid] == no)
				return mid;
			
			if(nums[mid] > no)
				return binarySearch(nums, no, left, mid-1);
			
			return binarySearch(nums, no, mid+1, right);
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BinarySearch.binarySearch(new int[] {1,2,3,4,5,6}, 6, 0, 5));

	}

}
