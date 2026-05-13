import java.util.Scanner;

public class _2224A_ArrayOperating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            long count = a[n - 1] > 0 ? 1 : 0;

            for (int i = n - 2; i >= 0; i--) {
                if (a[i + 1] > 0)
                    a[i] += a[i + 1];

                if (a[i] > 0) count++;
            }

            System.out.println(count);
        }
    }
}
