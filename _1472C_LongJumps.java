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

            long[][] dp = new long[n + 1][2];

            for (int i = n - 1; i >= 0; i--) {
                for (int prev = 0; prev <= 1; prev++) {
                    long notTake = 0;
                    if (prev == 0)
                        notTake = dp[i + 1][0];

                    long take = arr[i] + ((i + arr[i] < n) ? dp[i + arr[i]][1] : 0);

                    dp[i][prev] = Math.max(notTake, take);
                }
            }

            System.out.println(dp[0][0]);
        }
    }
}
