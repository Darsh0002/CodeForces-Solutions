import java.util.Scanner;

public class _2194B_Offshores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            long[] arr = new long[n];
            long total = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                total += (arr[i] / x);
            }

            long maxVal = 0;

            // try for all accounts
            // Total transfers available to account i is (total - its own contributions)
            for (int i = 0; i < n; i++) {
                long curr = arr[i] + (total - (arr[i] / x)) * y;
                maxVal = Math.max(maxVal, curr);
            }

            System.out.println(maxVal);
        }
    }
}
