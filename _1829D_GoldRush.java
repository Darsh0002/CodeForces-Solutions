import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _1829D_GoldRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            Map<Integer, Boolean> dp = new HashMap<>();

            System.out.println(isPossible(n, m, dp) ? "YES" : "NO");
        }
    }

    private static boolean isPossible(int n, int m, Map<Integer, Boolean> dp) {
        if (n == m)
            return true;

        if (n < m || n % 3 != 0)
            return false;

        if (dp.containsKey(n))
            return dp.get(n);

        boolean ans = false;

        if (isPossible(n / 3, m, dp) || isPossible((n / 3) * 2, m, dp))
            ans = true;

        dp.put(n, ans);

        return ans;
    }
}
