package src.LeetCode;

import java.util.HashSet;

public class FindUniquePrimeNumber {
	
	static void printDistinct(int arr[])
    {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();
  
        // Traverse the input array
        for (int i=0; i<arr.length; i++)
        {
            // If not present, then put it in hashtable and print it
            if (!set.contains(arr[i]))
            {
                set.add(arr[i]);
                System.out.print(arr[i] + " ");
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,2,3,5,1,2};
        printDistinct(arr);
	}

}
