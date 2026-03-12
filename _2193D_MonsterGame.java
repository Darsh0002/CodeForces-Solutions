import java.util.Arrays;
import java.util.Scanner;

public class _2193D_MonsterGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);

            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            long[] pref = new long[n];
            createPrefixArray(pref, b, n);

            long maxScore = 0;
            for (int i = 0; i < n; i++) {
                int x = a[i];

                int swords = n - i;
                int levels = lowerBound(swords, pref, n);

                long currentScore = (long) x * levels;
                maxScore = Math.max(maxScore, currentScore);
            }
            System.out.println(maxScore);
        }
    }

    private static void createPrefixArray(long[] pref, int[] b, int n) {
        pref[0] = b[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + b[i];
        }
    }

    private static int lowerBound(int key, long[] a, int n) {
        int l = 0, r = n - 1;
        int ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (a[mid] > key) r = mid - 1;
            else {
                ans = mid + 1;
                l = mid + 1;
            }
        }
        return ans;
    }
}
