/* 
    Problem statement
Send feedback
You are given an integer array 'ARR' of size 'N' and an integer 'S'. Your task is to return the list of all pairs of elements such that each sum of elements of each pair equals 'S'.
Note:
Each pair should be sorted i.e the first value should be less than or equals to the second value. 

Return the list of pairs sorted in non-decreasing order of their first value. In case if two pairs have the same first value, the pair with a smaller second value should come first.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= N <= 10^3
-10^5 <= ARR[i] <= 10^5
-2 * 10^5 <= S <= 2 * 10^5

Time Limit: 1 sec
Sample Input 1:
5 5
1 2 3 4 5
Sample Output 1:
1 4
2 3
Explaination For Sample Output 1:
Here, 1 + 4 = 5
      2 + 3 = 5
Hence the output will be, (1,4) , (2,3).
Sample Input 2:
5 0
2 -3 3 3 -2
Sample Output 2:
-3 3
-3 3
-2 2
*/





import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q81PairSum {

    public static List<List<Integer>> pairSum(int[] arr, int s) {
        List<List<Integer>> ans = new ArrayList<>();

        // Nested loop to find pairs
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == s) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(Math.min(arr[i], arr[j]));
                    temp.add(Math.max(arr[i], arr[j]));
                    ans.add(temp);
                }
            }
        }

        // Sort the list of pairs
        Collections.sort(ans, (a, b) -> {
            if (!a.get(0).equals(b.get(0))) {
                return a.get(0) - b.get(0);
            } else {
                return a.get(1) - b.get(1);
            }
        });

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 4, 5, 6, -1};
        int sum = 4;

        List<List<Integer>> result = pairSum(arr, sum);

        // Print the result
        for (List<Integer> pair : result) {
            System.out.println(pair);
        }
    }
}


