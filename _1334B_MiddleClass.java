import java.util.Arrays;
import java.util.Scanner;

public class _1334B_MiddleClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            Arrays.sort(a);

            int i = n - 1;
            long sum = 0, wealthy = 0;

            while (i >= 0) {
                sum += a[i];

                long avg = sum / (n - i);

                if (avg < x) {
                    break;
                } else wealthy++;

                i--;
            }

            System.out.println(wealthy);
        }
    }
}
