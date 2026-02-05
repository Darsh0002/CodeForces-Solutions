import java.util.Scanner;

public class _1690C_RestoringDuration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();

            int[] s = new int[n];
            for (int i = 0; i < n; i++) s[i] = sc.nextInt();

            int[] f = new int[n];
            for (int i = 0; i < n; i++) f[i] = sc.nextInt();

            System.out.print(f[0] - s[0]);

            for (int i = 1; i < n; i++) {
                System.out.print(" " + (f[i] - Math.max(f[i - 1], s[i])));
            }
            System.out.println();
        }
    }
}
