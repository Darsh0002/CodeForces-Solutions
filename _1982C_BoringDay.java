import java.util.Scanner;

public class _1982C_BoringDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int i = 0, j = 0;
            int sum = 0;

            int wins = 0;

            while (j < n) {
                sum += a[j];

                while (i < n && sum > r) {
                    sum -= a[i];
                    i++;
                }

                if (sum < l) {
                    j++;
                }

                if (sum >= l && sum <= r) {
                    wins++;

                    sum = 0;
                    j++;
                    i = j;
                }
            }

            System.out.println(wins);
        }
    }
}
