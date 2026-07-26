import java.util.Arrays;
import java.util.Scanner;

public class _1927D_FindDifferentOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] prevDiff = new int[n];
            Arrays.fill(prevDiff, -1);

            for (int i = 1; i < n; i++) {
                if (a[i] != a[i - 1]) {
                    prevDiff[i] = i - 1;
                } else {
                    prevDiff[i] = prevDiff[i - 1];
                }
            }

            int q = sc.nextInt();
            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                if (prevDiff[r - 1] >= l - 1) {
                    System.out.println(r + " " + (prevDiff[r - 1] + 1));
                } else {
                    System.out.println(-1 + " " + -1);
                }
            }
            System.out.println();
        }
    }
}
