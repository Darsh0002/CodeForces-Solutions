import java.util.Arrays;
import java.util.Scanner;

public class _433B_KuriyamaMiraiStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        long[] preV = new long[n];
        preV[0] = v[0];

        for (int i = 1; i < n; i++) {
            preV[i] = preV[i - 1] + v[i];
        }

        Arrays.sort(v);

        long[] preSorted = new long[n];
        preSorted[0] = v[0];

        for (int i = 1; i < n; i++) {
            preSorted[i] = preSorted[i - 1] + v[i];
        }

        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            int type = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (type == 1) {
                System.out.println(preV[r - 1] - (l == 1 ? 0 : preV[l - 2]));
            } else {
                System.out.println(preSorted[r - 1] - (l == 1 ? 0 : preSorted[l - 2]));
            }
        }
    }
}
