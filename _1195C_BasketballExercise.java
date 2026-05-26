import java.util.Arrays;
import java.util.Scanner;

public class _1195C_BasketballExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        long[][] dp = new long[n][3];
        for (long[] row : dp) Arrays.fill(row, -1);

        System.out.println(func(n - 1, 0, a, b, dp));
    }

    private static long func(int i, int prev, long[] a, long[] b, long[][] dp) {
        if (i == 0) {
            if (prev == 0) return Math.max(a[i], b[i]);

            return prev == 1 ? b[i] : a[i];
        }

        if (dp[i][prev] != -1) return dp[i][prev];

        long ans = 0;

        if (prev != 1) {
            long take = a[i] + func(i - 1, 1, a, b, dp);
            long notTake = func(i - 1, prev, a, b, dp);

            ans = Math.max(take, notTake);
        }

        if (prev != 2) {
            long take = b[i] + func(i - 1, 2, a, b, dp);
            long notTake = func(i - 1, prev, a, b, dp);

            ans = Math.max(ans, Math.max(take, notTake));
        }

        return dp[i][prev] = ans;
    }
}
