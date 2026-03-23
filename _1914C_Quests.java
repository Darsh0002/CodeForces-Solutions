import java.util.Scanner;

public class _1914C_Quests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int maxB = 0, ans = 0, sum = 0;

            for (int i = 0; i < Math.min(n, k); i++) {
                sum += a[i];
                maxB = Math.max(b[i], maxB);

                ans = Math.max(ans, sum + maxB * (k - i - 1));
            }

            System.out.println(ans);
        }
    }
}
