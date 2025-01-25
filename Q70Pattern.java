    /* 
            *
          *   *
        *       *
      *           *
    *               *
  *                   * 
*                       * 
  *                   *
    *               *
      *           *
        *       *
          *   *
            *

*/

import java.util.Scanner; 

public class Q70Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n (odd number):");
        int n = sc.nextInt();

        // Half of the diamond
        int mid = (n + 1) / 2;

        // Upper Triangle
        for (int i = 0; i < mid; i++) {
            // Print spaces
            for (int j = 0; j < mid - i - 1; j++) {
                System.out.print("  ");
            }
            // Print stars and hollow spaces
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower Triangle
        for (int i = 0; i < mid - 1; i++) {
            // Print spaces
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            // Print stars and hollow spaces
            for (int j = 0; j < 2 * (mid - i - 1) - 1; j++) {
                if (j == 0 || j == 2 * (mid - i - 1) - 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
