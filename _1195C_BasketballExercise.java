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

        dp[0][0] = Math.max(a[0], b[0]);
        dp[0][1] = b[0];
        dp[0][2] = a[0];

        long maxi = Math.max(dp[0][0], Math.max(dp[0][1], dp[0][2]));

        for (int i = 1; i < n; i++) {
            for (int prev = 0; prev < 3; prev++) {
                long ans = 0;

                if (prev != 1) {
                    long take = a[i] + dp[i - 1][1];
                    long notTake = dp[i - 1][prev];

                    ans = Math.max(take, notTake);
                }

                if (prev != 2) {
                    long take = b[i] + dp[i - 1][2];
                    long notTake = dp[i - 1][prev];

                    ans = Math.max(ans, Math.max(take, notTake));
                }

                dp[i][prev] = ans;

                maxi = Math.max(maxi, dp[i][prev]);
            }
        }

        System.out.println(maxi);
    }
}
