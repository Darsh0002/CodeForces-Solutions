import java.util.Scanner;

public class _1715B_BeutifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();

            long minSum = k * b;
            long maxSum = (k * b) + (k - 1) * n;

            if (s < minSum || s > maxSum) {
                System.out.println("-1");
            } else {
                long[] ans = new long[(int) n];
                ans[0] = minSum;
                s -= minSum;

                for (int i = 0; i < n; i++) {
                    long add = Math.min(k - 1, s);
                    ans[i] += add;
                    s -= add;
                }

                for (long value : ans) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }
}
