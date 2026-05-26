import java.util.Scanner;

public class _837D_RoundSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        System.out.println(maxRoundness(n - 1, 1, a, k));
    }

    private static long maxRoundness(int i, long prod, long[] a, int k) {
        if (k == 0)
            return countRoundness(prod);

        if (i < 0)
            return 0;

        long take = maxRoundness(i - 1, prod * a[i], a, k - 1);

        long skip = maxRoundness(i - 1, prod, a, k);

        return Math.max(take, skip);
    }

    private static long countRoundness(long num) {
        long roundness = 0;
        while (num > 0) {
            if (num % 10 == 0) {
                roundness++;
                num = num / 10;
            } else
                break;
        }
        return roundness;
    }
}
