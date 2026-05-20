import java.util.Scanner;

public class _1324B_YetAnotherPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean ok = false;

            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 2; j < n; j++) {
                    if (a[i] == a[j]) {
                        ok = true;
                        break;
                    }
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}