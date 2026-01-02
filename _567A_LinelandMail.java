import java.util.Scanner;

public class _567A_LinelandMail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            long minDist, maxDist;

            if (i == 0) {
                minDist = a[1] - a[0];
            } else if (i == n - 1) {
                minDist = a[n - 1] - a[n - 2];
            } else {
                minDist = Math.min(a[i] - a[i - 1], a[i + 1] - a[i]);
            }

            maxDist = Math.max(a[i] - a[0], a[n - 1] - a[i]);

            System.out.println(minDist + " " + maxDist);
        }
    }
}
