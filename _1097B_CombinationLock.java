import java.util.Scanner;

public class _1097B_CombinationLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Boolean[][] dp = new Boolean[n][360];

        System.out.println(solve(0, 0, dp, a, n) ? "YES" : "NO");
    }

    private static boolean solve(int i, int curr, Boolean[][] dp, int[] a, int n) {
        curr = ((curr % 360) + 360) % 360; // normalize curr to 0–359

        if (i == n) {
            return curr == 0;
        }

        if (dp[i][curr] != null)
            return dp[i][curr];

        boolean left = solve(i + 1, curr - a[i], dp, a, n);

        boolean right = solve(i + 1, curr + a[i], dp, a, n);

        return dp[i][curr] = left || right;
    }
}