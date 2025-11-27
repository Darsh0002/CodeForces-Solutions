import java.util.*;

public class _1807D_OddQueries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {

            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] a = new int[n + 1];
            long[] pre = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                pre[i] = pre[i - 1] + a[i];
            }

            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();

                long total = pre[n];
                long removed = pre[r] - pre[l - 1];
                long added = (long)(r - l + 1) * k;

                long newSum = total - removed + added;

                System.out.println(newSum % 2 != 0 ? "YES" : "NO");
            }
        }
    }
}
