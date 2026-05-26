import java.util.Arrays;
import java.util.Scanner;

public class _698A_Vacations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[][] dp = new int[n][4];
        for (int[] row : dp) Arrays.fill(row, -1);

        // prev =>
        // -1 -> Not Computed
        // 1 -> contest
        // 2 -> gym
        // 3 -> empty day

        System.out.println(solve(n - 1, 3, a, dp));
    }

    private static int solve(int i, int prev, int[] a, int[][] dp) {
        if (i == -1) return 0;

        if (dp[i][prev] != -1) return dp[i][prev];

        int ans = Integer.MAX_VALUE;

        // Option 1: Rest
        ans = 1 + solve(i - 1, 3, a, dp);

        // Option 2: Contest
        if ((a[i] == 1 || a[i] == 3) && prev != 1) {
            ans = Math.min(ans, solve(i - 1, 1, a, dp));
        }

        // Option 3: Gym
        if ((a[i] == 2 || a[i] == 3) && prev != 2) {
            ans = Math.min(ans, solve(i - 1, 2, a, dp));
        }

        return dp[i][prev] = ans;
    }
}