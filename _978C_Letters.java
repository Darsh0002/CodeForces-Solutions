import java.util.Scanner;

public class _978C_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] a = new long[n];
        long[] b = new long[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
        }

        long[] pre = new long[n];
        pre[0] = a[0];

        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + a[i];
        }

        for (long roomNum : b) {
            int idx = binarySearch(roomNum, pre, n);

            System.out.print((idx + 1) + " ");
            System.out.println(idx > 0 ? (roomNum - pre[idx - 1]) : roomNum);
        }
    }

    private static int binarySearch(long target, long[] a, int n) {
        int i = 0, j = n - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (a[mid] >= target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }
}
