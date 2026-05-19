import java.util.Scanner;

public class _466C_NumberOfWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        long total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }

        int ways = 0;

        long sum1 = 0;
        for (int i = 0; i < n - 2; i++) {
            sum1 += a[i];

            long sum2 = 0;

            for (int j = i + 1; j < n - 1; j++) {
                sum2 += a[j];

                long sum3 = total - sum1 - sum2;

                if (sum1 == sum2 && sum1 == sum3)
                    ways++;
            }
        }

        System.out.println(ways);
    }
}
