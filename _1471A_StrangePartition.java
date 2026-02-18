import java.util.Scanner;

public class _1471A_StrangePartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] arr = new long[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                sum += arr[i];
            }

            System.out.print(sum % x == 0 ? (sum / x) : (sum / x + 1));

            long maxBeauty = 0;
            for (int i = 0; i < n; i++) {
                maxBeauty += (arr[i] % x == 0 ? (arr[i] / x) : (arr[i] / x + 1));
            }

            System.out.print(" " + maxBeauty);
            System.out.println();
        }
    }
}
