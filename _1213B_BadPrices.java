import java.util.Scanner;

public class _1213B_BadPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int min = a[n - 1];

            int badDays = 0;
            for (int i = n - 2; i >= 0; i--) {
                if (a[i] > min) badDays++;
                else if (a[i] < min) {
                    min = a[i];
                }
            }
            System.out.println(badDays);
        }
    }
}
