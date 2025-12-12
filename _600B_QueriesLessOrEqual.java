import java.util.Arrays;
import java.util.Scanner;

public class _600B_QueriesLessOrEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long[] b = new long[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
        }

        solve(n, m, a, b);
    }

    private static void solve(int n, int m, long[] a, long[] b) {
        Arrays.sort(a);
        for (long num : b) {
            System.out.print(lowerBound(num, a, n) + " ");
        }
    }

    private static long lowerBound(long num, long[] a, int n) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] <= num) low = mid + 1;
            else high = mid - 1;
        }
        return (long) high + 1;
    }
}
