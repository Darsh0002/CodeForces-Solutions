import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _1987B_KSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            List<Long> diff = new ArrayList<>();

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            // Step 1: Identify "deficits" to make the array non-decreasing.
            // We track the maximum value seen so far. Any element smaller than
            // the current max needs to be increased by (max - a[i]) coins.
            int max = a[0];
            for (int i = 1; i < n; i++) {
                if (a[i] >= max) {
                    max = a[i];
                } else {
                    // Store the total increase needed for this specific element.
                    diff.add((long) (max - a[i]));
                }
            }

            // Step 2: Sort the differences to process them greedily.
            // By fixing the smallest deficits first, we can leverage the
            // multi-index operation (k) for the maximum number of elements.
            Collections.sort(diff);

            int m = diff.size();
            long ops = 0;   // Tracks how much we have already increased all remaining elements
            long coins = 0; // Total cost accumulated

            for (int i = 0; i < m; i++) {
                // 'req' is the additional increase needed for the current element
                // after accounting for previous operations.
                long req = diff.get(i) - ops;

                // Step 3: Calculate the cost for the current increment.
                // If we increase 'k' elements by 1, the cost is (k + 1).
                // Here, 'k' is the number of remaining elements (m - i).
                // Total cost for this step = amount of increase * (remaining elements + 1).
                coins += (req) * (m - i + 1);

                // Update total operations performed to adjust subsequent elements.
                ops += req;
            }
            System.out.println(coins);
        }
    }
}