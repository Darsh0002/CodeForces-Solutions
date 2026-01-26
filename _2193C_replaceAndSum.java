import java.util.Scanner;

public class _2193C_replaceAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] arr = new int[n];
            int[] brr = new int[n];

            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 0; i < n; i++) brr[i] = sc.nextInt();

            arr[n - 1] = Math.max(arr[n - 1], brr[n - 1]);

            // perform operation
            for (int i = n - 2; i >= 0; i--) {
                int x = Math.max(arr[i], arr[i + 1]);
                arr[i] = Math.max(x, brr[i]);
            }

            // prefix
            long[] pref = new long[n + 1];
            for (int i = 0; i < n; i++) {
                pref[i + 1] = pref[i] + arr[i];
            }

            // answer queries
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long ans = pref[r] - pref[l - 1];

                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}
