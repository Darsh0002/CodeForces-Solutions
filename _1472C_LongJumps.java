import java.util.Arrays;
import java.util.Scanner;

public class _1472C_LongJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long[][] dp = new long[n][2];
            for (long[] row : dp) Arrays.fill(row, -1);

            System.out.println(solve(0, 0, arr, dp, n));
        }
    }

    private static long solve(int i, int prevTaken, int[] arr, long[][] dp, int n) {
        if (i >= n) return 0;

        if (dp[i][prevTaken] != -1) return dp[i][prevTaken];

        long notTake = 0;
        if (prevTaken == 0)
            notTake = solve(i + 1, 0, arr, dp, n);

        long take = arr[i] + solve(i + arr[i], 1, arr, dp, n);

        return dp[i][prevTaken] = Math.max(notTake, take);
    }
}
