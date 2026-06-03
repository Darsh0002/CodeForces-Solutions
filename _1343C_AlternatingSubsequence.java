import java.util.Scanner;

public class _1343C_AlternatingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            /*
             * Key Observation:
             *
             * The required subsequence must alternate signs
             * (+, -, +, -, ...) or (-, +, -, +, ...).
             *
             * If we have a continuous segment of numbers with the same sign:
             *
             * Example:
             * [1, 2, 5, 3] -> all positive
             *
             * We can choose only ONE of them in the alternating subsequence,
             * because choosing two positives consecutively would violate
             * the alternating condition.
             *
             * To maximize the final sum, we should choose the maximum element
             * from each same-sign segment.
             *
             * Example:
             * [1, 2, 5, -4, -2, 7]
             *
             * Positive segment : [1, 2, 5]  -> choose 5
             * Negative segment : [-4, -2]   -> choose -2
             * Positive segment : [7]        -> choose 7
             *
             * Answer = 5 + (-2) + 7 = 10
             */

            long ans = 0;

            // Sign of current segment
            boolean pos = (arr[0] > 0);

            // Maximum element of current segment
            int curr = arr[0];

            for (int i = 1; i < n; i++) {

                // If current number belongs to the same sign segment
                if (pos == (arr[i] > 0)) {

                    // Keep the maximum element of this segment
                    curr = Math.max(curr, arr[i]);

                } else {

                    // Sign changed => current segment ended

                    // Add best element from previous segment
                    ans += curr;

                    // Start a new segment
                    pos = !pos;
                    curr = arr[i];
                }
            }

            // Add maximum element from the last segment
            ans += curr;

            System.out.println(ans);
        }
    }
}