import java.util.Arrays;
import java.util.Scanner;

public class _189A_CutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = {a, b, c};

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(countPieces(n, arr, dp));
    }

    private static int countPieces(int n, int[] arr, int[] dp) {
        if (n == 0) return 0;
        if (n < 0) return Integer.MIN_VALUE;
        if (dp[n] != -1) return dp[n];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            max = Math.max(max, 1 + countPieces(n - arr[i], arr, dp));
        }

        return dp[n] = max;
    }
}
