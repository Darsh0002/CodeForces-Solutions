import java.util.Scanner;

public class _1875A_JellyfishUndertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();

            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            // Approach: Use tool when timer reaches to 1

            long time = b - 1;
            b = 1;
            for (int i = 0; i < n; i++) {
                b += Math.min(a, b + arr[i]);
                b--;

                time += b - 1;
                b = 1;
            }
            System.out.println(time + 1); // we do +1 because at the end timer will go from 1 to 0
        }
    }
}
