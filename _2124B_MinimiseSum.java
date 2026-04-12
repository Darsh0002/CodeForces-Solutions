import java.util.Scanner;

public class _2124B_MinimiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            if (n == 1) {
                System.out.println(a[0]);
                continue;
            }

            if (a[0] > a[1]) {
                // perform operation on indices 0 and 1
                System.out.println(a[0] + a[1]);
            } else {
                // perform operation on indices 1 and 2
                System.out.println(2 * a[0]);
            }
        }
    }
}
