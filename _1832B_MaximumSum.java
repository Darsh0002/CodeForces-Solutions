import java.util.Arrays;
import java.util.Scanner;

public class _1832B_MaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);

            long[] pre = new long[n];
            pre[0] = arr[0];
            for (int i = 1; i < n; i++) {
                pre[i] = pre[i - 1] + arr[i];
            }

            long maxSum = 0;

            // check what happens if we do second operation i times
            for (int sec = 0; sec <= k; sec++) {
                int first = k - sec;

                int leftIndex = first * 2; // Calculate the number of elements removed by first operations
                int rightIndex = n - sec - 1; // Calculate the number of elements removed by second operations

                // Calculate the sum of remaining elements
                long sum = pre[rightIndex] - (leftIndex == 0 ? 0 : pre[leftIndex - 1]);
                maxSum = Math.max(maxSum, sum);
            }
            System.out.println(maxSum);
        }
    }
}