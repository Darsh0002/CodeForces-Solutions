import java.util.Scanner;

public class _1097B_CombinationLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(solve(0, 0, a, n) ? "YES" : "NO");
    }

    private static boolean solve(int i, int curr, int[] a, int n) {
        if (i == n) {
            return curr % 360 == 0;
        }

        // left
        if (solve(i + 1, curr - a[i], a, n)) return true;

        // right
        if (solve(i + 1, curr + a[i], a, n)) return true;

        return false;
    }
}