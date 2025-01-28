/*
     Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output
 
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:
Input: nums = [1,1,2]
Output: [1]
Example 3:
Input: nums = [1]
Output: []
 
Constraints:
•	n == nums.length
•	1 <= n <= 105
•	1 <= nums[i] <= n
•	Each element in nums appears once or twice.

*/

import java.util.List;
import java.util.ArrayList;

public class Q78DuplicatesInArray 
{
    public static List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            int index = val - 1;

            // If the value at this index is already negative, it means we've seen this number before
            if (nums[index] < 0) {
                result.add(val);
            } else {
                // Mark the value at this index as seen (make it negative)
                nums[index] = -nums[index];
            }
        }

        // Optional: Restore the original array values if needed
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return result;
    }

    public static void main(String args[])
    {
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums2 = {1, 1, 2};
        int[] nums3 = {1};

        System.out.println(findDuplicates(nums1)); // Output: [2, 3]
        System.out.println(findDuplicates(nums2)); // Output: [1]
        System.out.println(findDuplicates(nums3)); // Output: []
    }

}
