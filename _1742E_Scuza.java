import java.util.Scanner;

public class _1742E_Scuza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            long[] stairs = new long[n + 1];
            stairs[0] = 0;

            for (int i = 1; i <= n; i++) {
                stairs[i] = stairs[i - 1] + (long) a[i - 1];
            }

            for (int i = 0; i < q; i++) {
                int k = sc.nextInt();

                System.out.print(heightCanAchieve(stairs, k, n) + " ");
            }
            System.out.println();
        }
    }

    private static long heightCanAchieve(long[] stairs, int k, int n) {
        int i = 0;
        while (i < n) {
            if (stairs[i] + k < stairs[i + 1])
                return stairs[i];
            else
                i++;
        }

        return stairs[n]; // never executes
    }
}
