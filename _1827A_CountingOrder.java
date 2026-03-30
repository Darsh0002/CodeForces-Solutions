import java.util.Arrays;
import java.util.Scanner;

public class _1827A_CountingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long MOD = 1_000_000_007;

            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long[] brr = new long[n];

            for (int i = 0; i < n; i++) {
                brr[i] = sc.nextLong();
            }

            Arrays.sort(arr);
            Arrays.sort(brr);

            long ways = 1;
            for (int i = 0; i < n; i++) {
                long count = countSmaller(brr, arr[i], n);

                long rem = count - i; // possible places to put - already filled places
                if (rem == 0) {
                    ways = 0;
                    break;
                }
                ways = (ways * rem) % MOD;
            }
            System.out.println(ways);
        }
    }

    private static long countSmaller(long[] brr, long target, int n) {
        int i = 0, j = n - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (brr[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }

        }
        return i; // number of elements that are < target
    }
}
