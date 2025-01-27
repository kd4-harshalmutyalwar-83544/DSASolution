
    /* Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 
Example 1:
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:
Input: arr = [1,2]
Output: false
Example 3:
Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 
Constraints:
•	1 <= arr.length <= 1000
•	-1000 <= arr[i] <= 1000


*/

public class Q76UniqueOccurrence 
{
    public static boolean uniqueOccurrence(int arr[])
    {
        int n = arr.length;

	int occurrence[] = new int[n + 1];

	// For counting the occurrence of each element
	for (int i = 1; i <= n; i++) {
		for (int j = 0; j < n; j++) {
			if (arr[j] == i) {
				occurrence[i - 1]++;
			}
		}
	}

	// Checking if frequency array contains any duplicate
	// or not
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i == j || occurrence[i] == 0)
				continue;
			if (occurrence[i] == occurrence[j]) {

				// If any duplicate frequency then return
				// false
				return false;
			}
		}
	}

	// If no duplicate frequency found, then return true
	return true;
}

	

// This code is contributed by aadityaburujwale.

   public static void main(String args[])
   {
       int arr1[] = {1, 2, 2, 1, 1, 3};
    
       int arr2[] = {1, 2};
    
       int arr3[] = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
    
       if(uniqueOccurrence(arr3))
       {
          System.out.println("true");
       }
       else
       {
        System.out.println("false");
       }

   }    
}
