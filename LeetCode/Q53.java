package src.LeetCode;

public class Q53 {
	
    public int maxSubArray(int[] nums) {
    	
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        for(int i=0;i<nums.length;i++) {
        	cursum = cursum + nums[i];
        	if(cursum > maxsum) {
        		maxsum = cursum;
        	}
        	if(cursum < 0) {
        		cursum = 0;
        	}
        }
        return maxsum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q53 obj = new Q53();
		System.out.println(obj.maxSubArray(new int[] {-1}));
	}
}