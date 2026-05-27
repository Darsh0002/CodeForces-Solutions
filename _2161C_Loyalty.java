import java.util.*;

public class _2161C_Loyalty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int l = 0, r = n - 1;
            long s = 0;
            long points = 0;

            int[] ans = new int[n];
            int idx = 0;

            while (l <= r) {
                // If adding the largest available item pushes us to the next loyalty level
                if ((s + a[r]) / x > (s / x)) {
                    points += a[r];
                    s += a[r];
                    ans[idx++] = a[r];
                    r--;
                } else {
                    // Otherwise, build up the sum with the smallest available item
                    s += a[l];
                    ans[idx++] = a[l];
                    l++;
                }
            }

            System.out.println(points);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }

            System.out.println();
        }
    }
}

